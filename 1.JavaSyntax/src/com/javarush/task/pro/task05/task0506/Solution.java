package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array = new int[5];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();

        }
        int min = array[0];
        for (int i = 0; i < 5; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);

    }


}

