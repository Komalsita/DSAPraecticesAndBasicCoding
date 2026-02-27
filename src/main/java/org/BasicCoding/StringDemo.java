package org.BasicCoding;

public class StringDemo {
    // 1st two char array
    public static void main(String [] args){
        String str= "Hello";

        char[] chArr= str.toCharArray();
        for(int i= str.length()-1; i>=0; i--){
            System.out.print(chArr[i]);
        }
        System.out.println();
        // 2nd caret meathead get the charter from give string
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

         StringBuffer sb= new StringBuffer(str);
         System.out.print(sb.reverse());

        System.out.println();

        StringBuilder sbu= new StringBuilder(str);
        System.out.print(sbu.reverse());
        System.out.println();

         //Reverse Each Word In Given String

        String input=" Java SpringBoot";
        System.out.println("Orignal String:- " +input);

        String output="";
        String[] words= input.split(" ");

        for(String word: words){
            String revWord="";
            for(int i=word.length()-1; i>=0; i--) {
               revWord=revWord+word.charAt(i);
            }
            output +=  revWord+ " ";
            }
        System.out.println("revered string:- " + output);



        System.out.println();


        //Java Program To Remove Special Characters From Given String

        String strs="J@av@aS$p#ri%ng*";
        String plainStrs = strs.replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(plainStrs);

        System.out.println();

        //Java Program To Remove White Spaces From Given String
        String str1="  J a  v  a    S p r i n  g  B   o    o  t   ";
        String str2=str1.replaceAll("\\s","");
        System.out.print(str2);


    }


}
