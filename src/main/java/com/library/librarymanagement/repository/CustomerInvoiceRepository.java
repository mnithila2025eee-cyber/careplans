package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.librarymanagement.entity.CustomerInvoice;

public interface CustomerInvoiceRepository extends JpaRepository<CustomerInvoice, Long> {
}