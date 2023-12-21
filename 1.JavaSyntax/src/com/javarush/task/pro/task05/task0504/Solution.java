package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {

        resultArray = new int[firstArray1.length + secondArray.length];

        for (int q = 0; q < firstArray1.length; q++) {
            resultArray[q] = firstArray1[q];

        }
        for (int e = 0; e < secondArray.length; e++) {
            resultArray[firstArray1.length + e] = secondArray[e];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");

        }


    }
}
