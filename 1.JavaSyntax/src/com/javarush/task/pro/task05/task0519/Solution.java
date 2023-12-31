package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 22;

    public static void main(String[] args) {
        int[] array1 = array.clone();
        Arrays.sort(array1);
        int number = Arrays.binarySearch(array1, element);
        boolean result = number >= 0;
        System.out.println(result);
    }
}
