package com.jomariabejo.payrollsystem.payroll_system.model;

import java.time.LocalDate;

public class Employee extends Person {
    private int employeeNumber;
    private BankNumber bankNumber;
    private String position;
    private Status status;
    private String immediateSupervisor;
    private SalaryDetails salaryDetails;
    private Allowance allowance;

    public Employee(
            int employeeNumber, String position, Status status, String immediateSupervisor,
            String lastName, String firstName, String birthday, String address, String phoneNumber,
            String sssNum, String pagIbigNum, String philhealthNum, String tinNum,
            int basicSalary, int grossSemiMonthlyRate, float hourlyRate,
            int riceSubsidy, int phoneAllowance, int clothingAllowance
    ) {
        super(lastName, firstName, birthday, address, phoneNumber);
        this.employeeNumber = employeeNumber;
        this.position = position;
        this.status = status;
        this.immediateSupervisor = immediateSupervisor;
        this.bankNumber = new BankNumber(sssNum, philhealthNum, pagIbigNum, tinNum);
        this.salaryDetails = new SalaryDetails(basicSalary, grossSemiMonthlyRate, hourlyRate);
        this.allowance = new Allowance(riceSubsidy, phoneAllowance, clothingAllowance);
    }

    private boolean login(String username, String password) {
        return false;
    }

    private void setTimeIn(String timeIn) {
        LocalDate localDate = LocalDate.parse(timeIn);
    }

    private void setTimeOut(String timeOut) {
        LocalDate localDate = LocalDate.parse(timeOut);
    }

    private void viewAccountDetails() {

    }

    private void viewPayslip(byte month, byte year) {

    }

    private void viewLeaveRequestStatus() {

    }

    private void checkLeaveCreditsBalance() {

    }

    private void submitLeaveRequest() {

    }
}
