package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double num = Double.parseDouble(string);
        int num1 = (int) Math.round(num);
        System.out.println(num1);


    }




}
