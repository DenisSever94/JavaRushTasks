package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;
        while (number <= 100) {

            sum = sum + number;
            number++;
            if ((sum % 3 ) == 0) {
                continue;
            }
            System.out.println(sum);
        }

    }
}