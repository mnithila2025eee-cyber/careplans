package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.Patron;
import com.library.librarymanagement.service.PatronService;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {

    private final PatronService service;

    public PatronController(PatronService service) {
        this.service = service;
    }

    @PostMapping
    public Patron addPatron(@RequestBody Patron patron) {
        return service.addPatron(patron);
    }

    @GetMapping
    public List<Patron> getAllPatrons() {
        return service.getAllPatrons();
    }
}