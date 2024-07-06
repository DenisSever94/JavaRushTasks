package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        // Первый цикл выстривает высоту треугольника
        for (int i = 0; i <= 9; i++) {

           int start = 0 + i;
// Второй цикл прибавляет каждый новый виток 8 к предыдущему колличеситву 8
            // выводит в консоль с новой строки
            for (int j = 0; j <= start; j++) {

                System.out.print("8");
            }
            System.out.println();

        }

    }
}