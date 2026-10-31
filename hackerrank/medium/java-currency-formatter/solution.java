import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        // US Currency
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // Indian Currency
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // Chinese Currency
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // French Currency
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Format currency
        String usPayment = us.format(payment);
        String indiaPayment = india.format(payment);
        String chinaPayment = china.format(payment);
        String francePayment = france.format(payment);

        // Print output
        System.out.println("US: " + usPayment);
        System.out.println("India: " + indiaPayment);
        System.out.println("China: " + chinaPayment);
        System.out.println("France: " + francePayment);

        scanner.close();
    }
}
