package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.Checkout;
import com.library.librarymanagement.entity.EBookLicense;
import com.library.librarymanagement.repository.CheckoutRepository;
import com.library.librarymanagement.repository.EBookLicenseRepository;
import com.library.librarymanagement.repository.PatronRepository;

@Service
public class CheckoutService {

    private final CheckoutRepository checkoutRepository;
    private final EBookLicenseRepository licenseRepository;
    private final PatronRepository patronRepository;

    public CheckoutService(
            CheckoutRepository checkoutRepository,
            EBookLicenseRepository licenseRepository,
            PatronRepository patronRepository) {

        this.checkoutRepository = checkoutRepository;
        this.licenseRepository = licenseRepository;
        this.patronRepository = patronRepository;
    }

    // Checkout an e-book
    public Checkout checkoutBook(Long patronId, Long licenseId) {

        patronRepository.findById(patronId)
                .orElseThrow(() -> new RuntimeException("Patron not found"));

        EBookLicense license = licenseRepository.findById(licenseId)
                .orElseThrow(() -> new RuntimeException("License not found"));

        if (license.getCurrentCheckouts() >= license.getConcurrentLimit()) {
            throw new RuntimeException("Concurrent user limit reached");
        }

        license.setCurrentCheckouts(
                license.getCurrentCheckouts() + 1
        );

        licenseRepository.save(license);

        Checkout checkout = new Checkout();

        checkout.setPatronId(patronId);
        checkout.setLicenseId(licenseId);
        checkout.setStatus("ACTIVE");

        return checkoutRepository.save(checkout);
    }

    // Return an e-book
    public Checkout returnBook(Long checkoutId) {

        Checkout checkout = checkoutRepository.findById(checkoutId)
                .orElseThrow(() -> new RuntimeException("Checkout not found"));

        if (checkout.getStatus().equals("RETURNED")) {
            throw new RuntimeException("Book already returned");
        }

        EBookLicense license = licenseRepository.findById(
                checkout.getLicenseId()
        ).orElseThrow(() -> new RuntimeException("License not found"));

        if (license.getCurrentCheckouts() > 0) {
            license.setCurrentCheckouts(
                    license.getCurrentCheckouts() - 1
            );
        }

        licenseRepository.save(license);

        checkout.setStatus("RETURNED");

        return checkoutRepository.save(checkout);
    }

    // Get all checkouts
    public List<Checkout> getAllCheckouts() {
        return checkoutRepository.findAll();
    }
}