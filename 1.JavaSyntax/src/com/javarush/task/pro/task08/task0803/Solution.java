package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray1 = getArrayOfTenElements();
        System.out.println(min(intArray1));
        min(intArray1);
    }

    public static int min(int[] ints) {
        Arrays.sort(ints);
        return Math.min(ints[0], ints[1]);
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();

        }
        return num;
    }
}