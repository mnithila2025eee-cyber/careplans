package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.librarymanagement.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}