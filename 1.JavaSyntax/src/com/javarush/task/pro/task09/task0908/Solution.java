package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String str = "";
        if (binaryNumber == null) {
            return str;
        } else for (int i = 0; i <binaryNumber.length() ; i += 4) {
//            binaryNumber[i] ==


        }
            if (binaryNumber.length() % 4 == 0) {

            }



        for (int i = 0; i < binaryNumber.length(); i++) {

            }
            return null;



    }

    public static String toBinary(String hexNumber) {
        String str = "";
        if (str == "" || str == null) {
            return str;
        } else
            return null;
    }
}