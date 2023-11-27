package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int number = 0;
        while (number < 10) {
            System.out.println(str + text);
            number++;
        }
    }
}
