package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {

    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

        }
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);

    }


}

