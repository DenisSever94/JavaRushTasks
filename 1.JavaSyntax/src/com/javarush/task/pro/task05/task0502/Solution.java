package com.javarush.task.pro.task05.task0502;

/* 
Четные и нечетные ячейки массива
*/

public class Solution {
    public static final String ODD1 = "Нечётный";
    public static final String EVEN1 = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        strings[0] = "Чётный";
        strings[1] = "Нечётный";
        strings[2] = "Чётный";
        strings[3] = "Нечётный";
        strings[4] = "Чётный";



        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
