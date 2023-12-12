package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
     int size = scanner.nextInt();
     array = new int[size];
        for (int о = 0; о < size; о++) {
            array[о] = scanner.nextInt();
        } int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max)
                max = array[i];

        }
        System.out.println(max);
    }

}
