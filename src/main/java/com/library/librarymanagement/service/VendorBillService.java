package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.VendorBill;
import com.library.librarymanagement.repository.VendorBillRepository;

@Service
public class VendorBillService {

    private final VendorBillRepository repository;

    public VendorBillService(VendorBillRepository repository) {
        this.repository = repository;
    }

    public VendorBill createVendorBill(VendorBill bill) {
        return repository.save(bill);
    }

    public List<VendorBill> getAllVendorBills() {
        return repository.findAll();
    }
}