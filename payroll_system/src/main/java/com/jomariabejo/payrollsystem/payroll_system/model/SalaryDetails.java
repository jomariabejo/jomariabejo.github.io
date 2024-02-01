package com.jomariabejo.payrollsystem.payroll_system.model;

public class SalaryDetails {
    private int basicSalary;
    private int grossSemiMonthlyRate;
    private float hourlyRate;

    public SalaryDetails(int basicSalary, int grossSemiMonthlyRate, float hourlyRate) {
        this.basicSalary = basicSalary;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }
}
