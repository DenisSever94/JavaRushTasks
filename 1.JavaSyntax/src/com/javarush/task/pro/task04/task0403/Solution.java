package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        boolean ENTER = false;
        int sum = 0;

        while (scanner1.hasNextInt()) {
            int number = scanner1.nextInt();


            if (!ENTER) {
                sum = sum + number;
            } else ENTER = scanner1.equals(ENTER);

        }
        System.out.println(sum);
    }
}