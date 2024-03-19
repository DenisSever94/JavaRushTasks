package com.javarush.task.pro.task14.task1406;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Купи слона
*/

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        ArrayList<String> input = new ArrayList<>();
        while (true) {
            if (answer == null) {
                System.err.println("Купи слона");
            } else if (answer.toLowerCase().equals("ок")) {
                System.out.println("Так-то лучше :) Список твоих отговорок:");
                throw new SecurityException();
            } else {
                System.err.println("Все говорят \"" + answer + "\", а ты купи слона");
            }

            answer = scanner.nextLine();

            try {
                buyElephant(answer, scanner);
            } catch (Exception e) {
                System.out.println(answer);
                throw e;
            }
        }
    }
}