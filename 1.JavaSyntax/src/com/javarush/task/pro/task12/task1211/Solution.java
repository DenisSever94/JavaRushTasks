package com.javarush.task.pro.task12.task1211;

import java.util.Arrays;


public class Solution {

    public static int[] ints = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {

        Arrays.sort(ints);
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - i - 1; j++) {
//                if (numbers.get(j) > numbers.get(j + 1)) {
//                    int temp = numbers[i];
//                    numbers[i](j, numbers.get(j + 1));
//                    numbers.set(j + 1, temp);
//                }
//            }
//        }
    }

    public static void print() {
        for (int number : ints) {
            System.out.print(number + "\t");
        }
    }
}
