package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        } else
            while (decimalNumber != 0) {
                hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
                decimalNumber /= 16;
            }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int hexDecimal = 0;
        if (hexNumber == null) {
            return hexDecimal;
        } else {

            for (int i = 0; i < hexNumber.length(); i++) {
                hexDecimal = 16 * hexDecimal + HEX.indexOf(hexNumber.charAt(i));
            }
            return hexDecimal;
        }

    }
}