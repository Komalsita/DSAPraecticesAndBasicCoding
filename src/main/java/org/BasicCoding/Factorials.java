package org.BasicCoding;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.text.DecimalFormat; // Required for formatting

public class Factorials {
    static BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        BigInteger result = fact(n);

        // 1. Convert BigInteger to BigDecimal
        BigDecimal bd = new BigDecimal(result);

        // 2. Define the scientific notation pattern
        // "0.00000" defines the precision (5 decimal places)
        // "E0" triggers scientific notation (x 10^...)
        DecimalFormat df = new DecimalFormat("0.00000E0");

        // 3. Format and print
        String formatted = df.format(bd);

        // Optional: Replace 'E' with ' x 10^' for prettier output
        System.out.println("Result: " + formatted.replace("E", " x 10^"));

        sc.close();
    }
}