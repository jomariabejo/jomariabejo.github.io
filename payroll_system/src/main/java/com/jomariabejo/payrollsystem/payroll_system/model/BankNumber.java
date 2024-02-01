package com.jomariabejo.payrollsystem.payroll_system.model;

public class BankNumber {
    private String SSS;
    private String PHILHEALTH;
    private String PAGIBIG;
    private String TIN;

    public BankNumber(String SSS, String PHILHEALTH, String PAGIBIG, String TIN) {
        this.SSS = SSS;
        this.PHILHEALTH = PHILHEALTH;
        this.PAGIBIG = PAGIBIG;
        this.TIN = TIN;
    }

    public String getSSS() {
        return SSS;
    }

    public String getPHILHEALTH() {
        return PHILHEALTH;
    }

    public String getPAGIBIG() {
        return PAGIBIG;
    }

    public String getTIN() {
        return TIN;
    }
}
