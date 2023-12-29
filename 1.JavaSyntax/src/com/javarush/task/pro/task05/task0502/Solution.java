package com.javarush.task.pro.task05.task0502;

/* 
Четные и нечетные ячейки массива
*/

public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings1 = new String[5];

    public static void main(String[] args) {
        strings1[0] = "Чётный";
        strings1[1] = "Нечётный";
        strings1[2] = "Чётный";
        strings1[3] = "Нечётный";
        strings1[4] = "Чётный";



        System.out.print("index = 0");
        System.out.println(" value = " + strings1[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings1[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings1[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings1[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings1[4]);
    }
}
