package org.example;

public class CreditCalculator {
    private int years;
    private int summ;
    private int procent;

    public CreditCalculator(int years, int summ, int procent){
        this.years = years;
        this.summ = summ;
        this.procent = procent;
    }

    public double summCreditInMonth() {
        return 0.0;
    }

    public double commonSummCredit() {
        return 0.0;
    }

    public double summCreditOverpayment() {
        return 0.0;
    }
}
