package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);


        String line2 = str.nextLine();
        String line1 = str.nextLine();
        String line = str.nextLine();
        System.out.println();
        System.out.println(line);
        System.out.println(line1.toUpperCase());
        System.out.println(line2.toLowerCase());



    }
}
