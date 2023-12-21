package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] num;

        if (number > 0) {
            num = new int[number];
            if (number % 2 != 0) {
                for (int i = 0; i < num.length; i++) {
                    num[i] = scanner.nextInt();
                    System.out.println(Arrays.toString(num));

                }
            }
//            number = scanner.nextInt();












//        int[] num;
//        num = new int[scanner.nextInt()];
//        if (num.length > 0) {
//            if (num.length % 2 !=0 ) {
//
//
//            }


        }
    }
}
