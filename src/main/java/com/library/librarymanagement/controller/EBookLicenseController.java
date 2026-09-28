package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.EBookLicense;
import com.library.librarymanagement.service.EBookLicenseService;

@RestController
@RequestMapping("/api/ebooks/licenses")
public class EBookLicenseController {

    private final EBookLicenseService service;

    public EBookLicenseController(EBookLicenseService service) {
        this.service = service;
    }

    @PostMapping
    public EBookLicense addLicense(@RequestBody EBookLicense license) {
        return service.addLicense(license);
    }

    @GetMapping
    public List<EBookLicense> getAllLicenses() {
        return service.getAllLicenses();
    }
}