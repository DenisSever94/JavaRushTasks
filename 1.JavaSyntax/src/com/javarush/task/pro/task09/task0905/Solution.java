package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = -4;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = -35;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        }
        int i = 0;
        int octalNum = 0;
        while (decimalNumber != 0) {
            octalNum += (decimalNumber % 8) * Math.pow(10, i);
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return octalNum;
    }

    public static int toDecimal(int octalNumber) {
        int octalNumber1 = 0;
        if (octalNumber <= 0) {
            return octalNumber1;
        }
        int i = 0;
        int octalNum = 0;
        while (octalNumber != 0) {
            octalNum += (octalNumber % 10) * Math.pow(8, i);
            octalNumber = octalNumber / 10;
            i++;

        }
        return octalNum;


    }
}
