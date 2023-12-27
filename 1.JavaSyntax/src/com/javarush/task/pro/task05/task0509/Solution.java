package com.javarush.task.pro.task05.task0509;


public class Solution {

    public static int[][] MULTIPLICATION_TABLE1 = new int[10][10];

    public static void main(String[] args) {
        for (int i = 0; i < MULTIPLICATION_TABLE1.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE1[i].length; j++) {
                MULTIPLICATION_TABLE1[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < MULTIPLICATION_TABLE1.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE1[i].length; j++) {
                System.out.print(MULTIPLICATION_TABLE1[i][j] + " ");

            } System.out.println();
        }
    }
}
