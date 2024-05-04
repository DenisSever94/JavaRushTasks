package com.javarush.task.pro.task12.task1207;

/* 
Какое число меньше
*/

public class Solution {
    public static void main(String[] args) {
        int i = 2;
        int second = 3;

        Boolean isLess = isLess(i, second);

        if (isLess) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : false;
    }
}
