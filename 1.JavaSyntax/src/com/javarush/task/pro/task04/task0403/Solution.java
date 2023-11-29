package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ENTER = false;
        int sum = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (!ENTER) {
                sum = sum + number;
            } else ENTER = scanner.equals(ENTER);
        }
        System.out.println(sum);
    }
}