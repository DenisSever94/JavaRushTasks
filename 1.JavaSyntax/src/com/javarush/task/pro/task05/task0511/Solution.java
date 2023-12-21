package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;
import java.util.Arrays;


public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        multiArray = new int[num][num2];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num2; j++) {
                multiArray[i][j] = scanner.nextInt();

            }
            System.out.println(Arrays.deepToString(multiArray));
        }

    }

}
