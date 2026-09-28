package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymanagement.entity.EBookLicense;

public interface EBookLicenseRepository extends JpaRepository<EBookLicense, Long> {

}