package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.entity.Budget;
import com.library.librarymanagement.service.BudgetService;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    private final BudgetService service;

    public BudgetController(BudgetService service) {
        this.service = service;
    }

    @PostMapping
    public Budget createBudget(@RequestBody Budget budget) {
        return service.createBudget(budget);
    }

    @GetMapping
    public List<Budget> getAllBudgets() {
        return service.getAllBudgets();
    }
}