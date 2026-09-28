package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.librarymanagement.entity.Checkout;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
}