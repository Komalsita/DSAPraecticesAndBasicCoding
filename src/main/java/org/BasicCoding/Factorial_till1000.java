package org.BasicCoding;
import java.util.Scanner;
import java.math.BigInteger; // 1. Import BigInteger

public class Factorial_till1000 {
        // 2. Change return type to BigInteger
        static BigInteger fact(int n) {
            BigInteger res = BigInteger.ONE; // Equivalent to 1

            for (int i = 1; i <= n; i++) {
                // 3. Use multiply() method instead of *=
                res = res.multiply(BigInteger.valueOf(i));
            }
            return res;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number for which you want to calculate the factorial: ");

            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                System.out.println("Factorial of " + n + " is: ");
                System.out.println(fact(n));
            }
            sc.close();
        }

}
