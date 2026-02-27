package org.BasicCoding;

public class ArrayDemo {

    //SUBARRAYS
 public static void main(String [] args){
    int[] ar= {1,2,3,4,2,1,4,2,1};
    int size=3;
    int i;
    int j;

    for(i=0; i<= ar.length-size; i++){
        for(j=i; j < i+size;j++){
            System.out.print(ar[j] + " ");
        }
        System.out.println();
    }

    /// print subarry addtion
     int sum;
     for(i=0; i<= ar.length-size; i++){
         sum=0;
         for(j=i; j < i+size;j++){
             sum= sum+ ar[j];
         }
         System.out.print(sum + " " );
     }
     System.out.println();
     // k=6 if the sub arry sum is 6 the how may sub arrys have the count print
     int sum1=0;
     int k=7;
     int count=0;
     for(i=0; i<= ar.length-size; i++){
         sum1=0;
         for(j=i; j < i+size;j++){
             sum1= sum1+ ar[j];
         }

         if(sum1==k){
             count++;
         }
     }
     System.out.println(count);
}}
