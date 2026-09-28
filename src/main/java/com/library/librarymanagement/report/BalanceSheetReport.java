package com.library.librarymanagement.report;

public class BalanceSheetReport {

    private double assets;
    private double liabilities;
    private double netAssets;

    public BalanceSheetReport(double assets, double liabilities) {
        this.assets = assets;
        this.liabilities = liabilities;
        this.netAssets = assets - liabilities;
    }

    public double getAssets() {
        return assets;
    }

    public double getLiabilities() {
        return liabilities;
    }

    public double getNetAssets() {
        return netAssets;
    }
}