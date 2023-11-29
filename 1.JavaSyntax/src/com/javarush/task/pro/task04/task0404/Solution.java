package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int line = 0;

        while (line < 5) {
            int line1 = 0;
            while (line1 < 9) {
                System.out.print("Q");
                line1++;
            }
            System.out.println("Q");
            line++;
        }
    }
}