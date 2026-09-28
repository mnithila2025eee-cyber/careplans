package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.librarymanagement.entity.VendorBill;

public interface VendorBillRepository extends JpaRepository<VendorBill, Long> {
}