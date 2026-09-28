package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.VendorBill;
import com.library.librarymanagement.service.VendorBillService;

@RestController
@RequestMapping("/api/vendor-bills")
public class VendorBillController {

    private final VendorBillService service;

    public VendorBillController(VendorBillService service) {
        this.service = service;
    }

    @PostMapping
    public VendorBill createVendorBill(@RequestBody VendorBill bill) {
        return service.createVendorBill(bill);
    }

    @GetMapping
    public List<VendorBill> getAllVendorBills() {
        return service.getAllVendorBills();
    }
}