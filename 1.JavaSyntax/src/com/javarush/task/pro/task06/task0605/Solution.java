package com.javarush.task.pro.task06.task0605;



public class Solution {

    public static void main(String[] args) {
        int[] arrayy = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(arrayy);
        reverseArray(arrayy);
        printArray(arrayy);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;


        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
