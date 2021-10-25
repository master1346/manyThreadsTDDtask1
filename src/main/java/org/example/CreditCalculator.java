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
        return ((summ * (1 + years * procent / 100))/( years * 12));
    }

    public double commonSummCredit() {
        return ((summ * years * procent / 100) + summ);
    }

    public double summCreditOverpayment() {
        return (summ * years * procent / 100);
    }
}
