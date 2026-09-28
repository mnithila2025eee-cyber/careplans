package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.Budget;
import com.library.librarymanagement.repository.BudgetRepository;

@Service
public class BudgetService {

    private final BudgetRepository repository;

    public BudgetService(BudgetRepository repository) {
        this.repository = repository;
    }

    // Create a new budget
    public Budget createBudget(Budget budget) {
        return repository.save(budget);
    }

    // Get all budgets
    public List<Budget> getAllBudgets() {
        return repository.findAll();
    }
}