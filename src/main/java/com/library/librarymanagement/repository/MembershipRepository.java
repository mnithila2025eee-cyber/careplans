package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.librarymanagement.entity.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}