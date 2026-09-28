package com.library.librarymanagement.report;

public class BudgetReport {

    private double allocatedAmount;
    private double spentAmount;
    private double remainingAmount;

    public BudgetReport(double allocatedAmount, double spentAmount) {
        this.allocatedAmount = allocatedAmount;
        this.spentAmount = spentAmount;
        this.remainingAmount = allocatedAmount - spentAmount;
    }

    public double getAllocatedAmount() {
        return allocatedAmount;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}