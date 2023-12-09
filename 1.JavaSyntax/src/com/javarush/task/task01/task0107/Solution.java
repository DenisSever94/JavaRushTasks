package com.javarush.task.task01.task0107;

/* 
Комментарии излишни
*/

public class Solution {
    public static void main(String[] args) {
        int d = 2;
        int c = 12;

        // y = x * y;
         c = d + c;

        d = c - d;
        c = c - d;

        System.out.println(d);
        System.out.println(c);
    }
}
