import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String printCurrency(Locale locale,Double val){ 
        NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
        String currency=formatter.format(val); 
        return currency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale IND = new Locale("en", "IN");
        String us = printCurrency(Locale.US,payment);
        String india = printCurrency(IND,payment);
        String china = printCurrency(Locale.CHINA,payment);
        String france = printCurrency(Locale.FRANCE,payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
