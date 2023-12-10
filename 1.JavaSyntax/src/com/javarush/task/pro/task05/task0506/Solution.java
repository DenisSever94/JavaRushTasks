package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {

    public static int[] myArray;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();

        }
        int min = myArray[0];
        for (int i = 0; i < size; i++) {
            if (myArray[i] < min)
                min = myArray[i];
        }
        System.out.println(min);

    }


}

