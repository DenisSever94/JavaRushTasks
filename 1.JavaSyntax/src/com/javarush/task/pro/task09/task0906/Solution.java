package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        String militaryCommissar = ", явитесь в военкомат";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner (System.in);
        int age = scanner1.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }


//        int decimalNumber = Integer.MAX_VALUE;
//        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
//        String binaryNumber = "1111111111111111111111111111111";
//        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }
//
//    public static String toBinary(int decimalNumber) {
////        if (decimalNumber <= 0) {
//            return "";
//        } else {
//            String bi = "";
//            while (decimalNumber != 0) {
//                int num = decimalNumber % 2;
//                bi = num + bi;
//                decimalNumber = decimalNumber / 2;
//
//            }
//            return bi;
//        }
//    }
//
//    public static int toDecimal(String binaryNumber) {
//        int decimalNumber = 0;
//        if (binaryNumber == null) {
//            return decimalNumber;
//        }
//
//        for (int i = 0; i < binaryNumber.length(); i++) {
//            int index = binaryNumber.length() - 1 - i;
//            int value = Character.getNumericValue(binaryNumber.charAt(index));
//            decimalNumber += value * Math.pow(2, i);
//
//        }
//        return decimalNumber;
//    }
}