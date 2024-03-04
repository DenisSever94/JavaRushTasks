package com.javarush.task.pro.task06.task0611;

/* 
Анализ массивов
*/

public class Solution {
    public static void main(String[] args) {
        int[] arrayy = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("В массиве: ");
        printArray(arrayy);
        System.out.println("Минимальное число: " + getMinValue(arrayy));
        System.out.println("Максимальное число: " + getMaxValue(arrayy));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
