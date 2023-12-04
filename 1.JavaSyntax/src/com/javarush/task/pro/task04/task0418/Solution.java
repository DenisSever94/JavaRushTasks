package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
     Scanner scanner = new Scanner(System.in);
     boolean i = scanner.nextBoolean();

     if (i == true) {
         int i1 = (int) Math.ceil(0.5);
         System.out.println(i1);

     } else if (i == false) {
         int i2 = (int) Math.floor(0.5);
         System.out.println(i2);
     }

    }
}