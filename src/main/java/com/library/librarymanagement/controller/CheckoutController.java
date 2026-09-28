package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.Checkout;
import com.library.librarymanagement.service.CheckoutService;

@RestController
@RequestMapping("/api/ebooks")
public class CheckoutController {

    private final CheckoutService service;

    public CheckoutController(CheckoutService service) {
        this.service = service;
    }

    @PostMapping("/checkout")
    public Checkout checkoutBook(@RequestBody Checkout checkout) {
        return service.checkoutBook(
                checkout.getPatronId(),
                checkout.getLicenseId()
        );
    }

    @GetMapping("/checkout")
    public List<Checkout> getAllCheckouts() {
        return service.getAllCheckouts();
    }

    @PostMapping("/return/{checkoutId}")
    public Checkout returnBook(@PathVariable Long checkoutId) {
        return service.returnBook(checkoutId);
    }
}