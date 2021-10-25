package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.security.auth.login.CredentialException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testSummCreditInMonth(){
        CreditCalculator creditCalculator = new CreditCalculator(2, 100000, 12);
        int years = 2;
        int summ = 100000;
        int procent = 12;
        double sumCreditInMonth = creditCalculator.summCreditInMonth();
        assertTrue("Неверная сумма выплаты в месяц" , (summ * (1 + years * procent/100))/(years * 12) == sumCreditInMonth );
    }
    @Test
    public void testCommonSummCredit(){
        CreditCalculator creditCalculator = new CreditCalculator(2, 100000, 12);
        int years = 2;
        int summ = 100000;
        int procent = 12;
        double commonSummCredit = creditCalculator.commonSummCredit();
        assertTrue("Неверная полная сумма кредита" , (summ * (1 + years * procent/100)) == commonSummCredit );
    }
    @Test
    public void testSummCreditOverpayment(){
        CreditCalculator creditCalculator = new CreditCalculator(2, 100000, 12);
        int years = 2;
        int summ = 100000;
        int procent = 12;
        double summCreditOverpayment = creditCalculator.summCreditOverpayment();
        assertTrue("Неверная сумма переплаты по кредиту" , (summ * years * procent / 100) == summCreditOverpayment );
    }
}
