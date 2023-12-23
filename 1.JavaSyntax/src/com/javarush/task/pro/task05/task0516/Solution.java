package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        /*

         */

        Arrays.fill(array, 0, 11, valueStart);
        Arrays.fill(array, 11, 21, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
