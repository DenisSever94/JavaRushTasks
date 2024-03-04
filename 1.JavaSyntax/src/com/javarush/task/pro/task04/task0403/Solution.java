package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        boolean enter = false;
        int sum = 0;

        while (scanner1.hasNextInt()) {
            int number = scanner1.nextInt();


            if (!enter) {
                sum = sum + number;
            } else enter = scanner1.equals(enter);

        }
        System.out.println(sum);
    }
}