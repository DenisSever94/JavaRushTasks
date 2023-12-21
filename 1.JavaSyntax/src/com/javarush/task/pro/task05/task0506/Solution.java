package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {

    public static int[] array1;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();

        }
        int min = array1[0];
        for (int i = 0; i < size; i++) {
            if (array1[i] < min)
                min = array1[i];
        }
        System.out.println(min);

    }


}

