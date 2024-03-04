package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        String string = " любит меня.";


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        int number = 0;
        while (number < 10) {
            System.out.println(str + string);
            number++;
        }
    }
}
