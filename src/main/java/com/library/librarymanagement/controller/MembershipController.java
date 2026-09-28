package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.Membership;
import com.library.librarymanagement.service.MembershipService;

@RestController
@RequestMapping("/api/memberships")
public class MembershipController {

    private final MembershipService service;

    public MembershipController(MembershipService service) {
        this.service = service;
    }

    @PostMapping
    public Membership createMembership(@RequestBody Membership membership) {
        return service.createMembership(membership);
    }

    @GetMapping
    public List<Membership> getAllMemberships() {
        return service.getAllMemberships();
    }
}