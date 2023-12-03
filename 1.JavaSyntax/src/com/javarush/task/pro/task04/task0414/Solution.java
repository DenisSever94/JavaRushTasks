package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();
        int i = 0;

        if (number >= 0 && number <= 5) {
            do {
                System.out.println(str);
                i++;
            } while (i < number);
        } else System.out.println(str);

    }


}
