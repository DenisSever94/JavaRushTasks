package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {


        int eight = 1;
        while (eight <= 10) {

            int width = 1;
            while (width <= 20) {
                if (eight == 1 || eight == 10)
                    System.out.print("Б");
                else if (width == 1 || width == 20) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                width++;
            }
            System.out.println();
            eight++;
        }
    }
}



