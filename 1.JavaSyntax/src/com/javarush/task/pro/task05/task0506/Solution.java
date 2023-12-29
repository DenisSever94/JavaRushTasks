package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {

    public static int[] array2;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();

        }
        int min = array2[0];
        for (int i = 0; i < size; i++) {
            if (array2[i] < min)
                min = array2[i];
        }
        System.out.println(min);

    }


}

