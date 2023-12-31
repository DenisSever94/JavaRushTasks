package com.javarush.task.pro.task05.task0515;

import java.util.Arrays;

/* 
Сравнение двумерных массивов
*/

public class Solution {

    public static int[][] arrayFirst1 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {

       boolean s = Arrays.deepEquals(arrayFirst1, arraySecond2);

        System.out.println(s);
    }
}
