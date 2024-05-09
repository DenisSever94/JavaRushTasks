package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;
import java.util.Arrays;


public class Solution {
    public static int[][] ints;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        ints = new int[num][];
        for (int i = 0; i < num; i++) {
            int num2 = scanner.nextInt();
            ints[i] = new int[num2];

        }
        System.out.println(Arrays.deepToString(ints));


    }

}
