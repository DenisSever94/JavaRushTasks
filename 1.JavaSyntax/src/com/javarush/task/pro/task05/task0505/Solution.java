package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner66 = new Scanner(System.in);
        int number scanner66= scanner66.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner66.nextInt();

        }

        if (number % 2 != 0) {
            for (int i = 0; i < number; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);

            }
        }


    }
}
