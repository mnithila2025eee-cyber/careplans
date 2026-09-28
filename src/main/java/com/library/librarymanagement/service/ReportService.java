package com.library.librarymanagement.service;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.Budget;
import com.library.librarymanagement.repository.BudgetRepository;
import com.library.librarymanagement.repository.PaymentRepository;
import com.library.librarymanagement.report.BudgetReport;
import com.library.librarymanagement.report.ProfitLossReport;
import com.library.librarymanagement.report.BalanceSheetReport;

@Service
public class ReportService {

    private final BudgetRepository budgetRepository;
    private final PaymentRepository paymentRepository;

    public ReportService(BudgetRepository budgetRepository,
                         PaymentRepository paymentRepository) {

        this.budgetRepository = budgetRepository;
        this.paymentRepository = paymentRepository;
    }

    public BudgetReport getBudgetReport() {

        Budget budget = budgetRepository.findAll()
                .stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Budget not found"));

        return new BudgetReport(
                budget.getAllocatedAmount(),
                budget.getSpentAmount()
        );
    }

    public ProfitLossReport getProfitLossReport() {

        double revenue = 0;

        double expenses = paymentRepository.findAll()
                .stream()
                .mapToDouble(payment -> payment.getAmount())
                .sum();

        return new ProfitLossReport(
                revenue,
                expenses
        );
    }

    public BalanceSheetReport getBalanceSheetReport() {

        double assets = budgetRepository.findAll()
                .stream()
                .mapToDouble(budget -> budget.getAllocatedAmount())
                .sum();

        double liabilities = paymentRepository.findAll()
                .stream()
                .mapToDouble(payment -> payment.getAmount())
                .sum();

        return new BalanceSheetReport(
                assets,
                liabilities
        );
    }
}