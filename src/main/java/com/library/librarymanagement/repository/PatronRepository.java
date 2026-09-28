package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymanagement.entity.Patron;

public interface PatronRepository extends JpaRepository<Patron, Long> {

}