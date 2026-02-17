package org.BasicCoding;

import java.util.Scanner;
//exception handling code and negative value also with string
/*public class Counter {
   static int countDigit(int n){

       int count=0;
       while(n>0){
           n=n/10;

           count++;
       }
       return count;
   }

    public static void main(String []args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Please hent the number which you want to count the digits: ");
       int n=sc.nextInt();
        System.out.println(countDigit(n));

    }*/


public class Counter {
    // This method now counts everything: letters, numbers, and symbols
    static int countAll(String input) {
        if (input == null) return 0;
        // .length() gives the total count of characters
        return input.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string, number, or decimal: ");

        // We use nextLine() to capture everything (including spaces)
        String n = sc.nextLine();

        System.out.println("The total count of characters/digits is: " + countAll(n));

        sc.close();
    }
}