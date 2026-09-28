package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.EBookLicense;
import com.library.librarymanagement.repository.EBookLicenseRepository;

@Service
public class EBookLicenseService {

    private final EBookLicenseRepository repository;

    public EBookLicenseService(EBookLicenseRepository repository) {
        this.repository = repository;
    }

    public EBookLicense addLicense(EBookLicense license) {
        return repository.save(license);
    }

    public List<EBookLicense> getAllLicenses() {
        return repository.findAll();
    }
}