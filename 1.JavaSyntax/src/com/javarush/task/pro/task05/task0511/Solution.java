package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;
import java.util.Arrays;


public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        multiArray = new int[num][];
        multiArray[0] = new int[num1];
        multiArray[1] = new int[num1];
        multiArray[2] = new int[num1];
        multiArray[3] = new int[num1];
        multiArray[4] = new int[num1];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
//                System.out.println(Arrays.deepToString(multiArray));


            }

        }


    }
}