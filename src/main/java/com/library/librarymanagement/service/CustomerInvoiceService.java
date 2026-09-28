package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.CustomerInvoice;
import com.library.librarymanagement.repository.CustomerInvoiceRepository;

@Service
public class CustomerInvoiceService {

    private final CustomerInvoiceRepository repository;

    public CustomerInvoiceService(CustomerInvoiceRepository repository) {
        this.repository = repository;
    }

    public CustomerInvoice createInvoice(CustomerInvoice invoice) {
        return repository.save(invoice);
    }

    public List<CustomerInvoice> getAllInvoices() {
        return repository.findAll();
    }
}