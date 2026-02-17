package org.BasicCoding;

import java.util.Scanner;

public class TrailingZerosFact {

    static int trailingZero(int n){
        int rut=0;
        int powerof5= 5;
        while(n>= powerof5){
            rut = rut + (n/powerof5);
            powerof5 = powerof5 * 5;
        }
        return rut;
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the valu: ");
        int n= sc.nextInt();
        System.out.println(trailingZero(n));

    }
}
