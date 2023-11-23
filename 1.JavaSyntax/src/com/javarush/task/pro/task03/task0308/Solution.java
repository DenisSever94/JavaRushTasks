package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int x;
        int y;

        if (number1 > 0 && number2 > 0)
            System.out.println("1");
        if (number1 < 0 && number2 > 0)
            System.out.println("2");
        if (number1 < 0 && number2 < 0)
            System.out.println("3");
        if (number1 > 0 && number2 < 0)
            System.out.println("4");


    }
}
