package com.javarush.task.pro.task04.task0404;


public class Solution {
    public static void main(String[] args) {
        int line2 = 0;

        while (line2 < 5) {
            int line1 = 0;
            while (line1 < 9) {
                System.out.print("Q");
                line1++;
            }
            System.out.println("Q");
            line2++;
        }
    }
}