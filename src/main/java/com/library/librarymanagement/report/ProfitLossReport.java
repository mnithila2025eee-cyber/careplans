package com.library.librarymanagement.report;

public class ProfitLossReport {

    private double revenue;
    private double expenses;
    private double netResult;

    public ProfitLossReport(double revenue, double expenses) {
        this.revenue = revenue;
        this.expenses = expenses;
        this.netResult = revenue - expenses;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getNetResult() {
        return netResult;
    }
}