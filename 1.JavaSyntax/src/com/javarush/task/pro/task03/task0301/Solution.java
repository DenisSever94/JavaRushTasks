package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner scanner = new Scanner(System.in);

        int tempStreet = scanner.nextInt();
        if (tempStreet < 0) {
            System.out.println(cold);
        } else if (tempStreet >= 0) {
            System.out.println(warm);
        }


    }
}
