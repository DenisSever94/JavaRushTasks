package com.javarush.task.pro.task04.task0407;

public class Solution {
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;
        while (number < 100) {


            number++;
            if ((number % 3 ) == 0) {
                continue;
            }
            sum = sum + number;
        }
        System.out.println(sum);
    }
}