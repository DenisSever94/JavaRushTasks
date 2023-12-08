package com.javarush.task.task01.task0107;

/* 
Комментарии излишни
*/

public class Solution {
    public static void main(String[] args) {
        int o = 2;
        int h = 12;

        // y = x * y;
         h = o + h;

        o = h - o;
        h = h - o;

        System.out.println(o);
        System.out.println(h);
    }
}
