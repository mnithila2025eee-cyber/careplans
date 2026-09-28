package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.Membership;
import com.library.librarymanagement.repository.MembershipRepository;

@Service
public class MembershipService {

    private final MembershipRepository repository;

    public MembershipService(MembershipRepository repository) {
        this.repository = repository;
    }

    public Membership createMembership(Membership membership) {
        return repository.save(membership);
    }

    public List<Membership> getAllMemberships() {
        return repository.findAll();
    }
}