package com.javarush.task.pro.task08.task0813;


import java.util.Scanner;
/* 
Степень двойки
*/

public class Solution {

   public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);

       String str1 = scanner.nextLine();
       String str2 = scanner.nextLine();
       String str3 = scanner.nextLine();
       System.out.println(str1.toLowerCase());
       System.out.println(str2.toUpperCase());
       System.out.println(str3);


//        System.out.println(getPowerOfTwo(3));
//    }
//
//    public static int getPowerOfTwo(int power) {
//        int result = 2;
//        for(int i = 0; i < power - 1; i++) {
//            result *= 2;
//        }
//        return 1 << power ;
    }
}
