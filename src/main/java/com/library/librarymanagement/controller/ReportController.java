package com.library.librarymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.report.BalanceSheetReport;
import com.library.librarymanagement.report.BudgetReport;
import com.library.librarymanagement.report.ProfitLossReport;
import com.library.librarymanagement.service.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService service;

    public ReportController(ReportService service) {
        this.service = service;
    }

    @GetMapping("/budget")
    public BudgetReport getBudgetReport() {
        return service.getBudgetReport();
    }

    @GetMapping("/profit-loss")
    public ProfitLossReport getProfitLossReport() {
        return service.getProfitLossReport();
    }

    @GetMapping("/balance-sheet")
    public BalanceSheetReport getBalanceSheetReport() {
        return service.getBalanceSheetReport();
    }
}