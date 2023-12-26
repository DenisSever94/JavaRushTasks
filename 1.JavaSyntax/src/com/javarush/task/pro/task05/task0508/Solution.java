package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;


public class Solution {
    public static String[] strings1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings1 = new String[6];
        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = scanner.nextLine();
       }
        for (int i = 0; i < strings1.length - 1; i++) {
            String srt = strings1[i];
            for (int j = i + 1; j < strings1.length; j++) {

                if (srt == null) {
                    break;
                }
                if (srt.equals(strings1[j])) {
                    strings1[i] = null;
                    strings1[j] = null;

                }
            }
        }

        for (int i = 0; i < strings1.length; i++) {
            System.out.print(strings1[i] + ", ");
        }
    }
}
