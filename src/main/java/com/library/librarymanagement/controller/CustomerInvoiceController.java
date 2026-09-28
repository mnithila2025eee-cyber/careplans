package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.CustomerInvoice;
import com.library.librarymanagement.service.CustomerInvoiceService;

@RestController
@RequestMapping("/api/customer-invoices")
public class CustomerInvoiceController {

    private final CustomerInvoiceService service;

    public CustomerInvoiceController(CustomerInvoiceService service) {
        this.service = service;
    }

    @PostMapping
    public CustomerInvoice createInvoice(@RequestBody CustomerInvoice invoice) {
        return service.createInvoice(invoice);
    }

    @GetMapping
    public List<CustomerInvoice> getAllInvoices() {
        return service.getAllInvoices();
    }
}