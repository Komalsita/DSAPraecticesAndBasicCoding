package org.BasicCoding;
import java.util.Scanner;
public class Factorial {
    static long fact(long n){
         long res=1;
        for(int i=1; i<= n; i++){
             res *= i;
        }
        return res;
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want to calculate the factorial: ");
        long n= sc.nextInt();
        System.out.println(fact(n));
    }
}
