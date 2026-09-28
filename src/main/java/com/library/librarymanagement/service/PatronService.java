package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.Patron;
import com.library.librarymanagement.repository.PatronRepository;

@Service
public class PatronService {

    private final PatronRepository repository;

    public PatronService(PatronRepository repository) {
        this.repository = repository;
    }

    public Patron addPatron(Patron patron) {
        return repository.save(patron);
    }

    public List<Patron> getAllPatrons() {
        return repository.findAll();
    }
}