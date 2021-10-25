package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        CreditCalculator creditCalculator1 = new CreditCalculator(5, 300000, 8);
        CreditCalculator creditCalculator2 = new CreditCalculator(3, 100000, 16);

        System.out.println( "Сумма платежа в месяц - " + creditCalculator1.summCreditInMonth() + "; "
                + "Общая сумма - " + creditCalculator1.commonSummCredit() + "; " + "Сумма переплаты - "
                + creditCalculator1.summCreditOverpayment() + ";");
        System.out.println( "Сумма платежа в месяц - " + creditCalculator2.summCreditInMonth() + "; "
                + "Общая сумма - " + creditCalculator2.commonSummCredit() + "; " + "Сумма переплаты - "
                + creditCalculator2.summCreditOverpayment() + ";");


    }
}
