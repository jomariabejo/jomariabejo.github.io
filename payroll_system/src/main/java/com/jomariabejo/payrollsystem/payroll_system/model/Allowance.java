package com.jomariabejo.payrollsystem.payroll_system.model;

public class Allowance {
    private int riceSubsidy;
    private int phoneAllowance;
    private int clothingAllowance;

    public Allowance(int riceSubsidy, int phoneAllowance, int clothingAllowance) {
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
    }

    public int getRiceSubsidy() {
        return riceSubsidy;
    }

    public int getPhoneAllowance() {
        return phoneAllowance;
    }

    public int getClothingAllowance() {
        return clothingAllowance;
    }
}
