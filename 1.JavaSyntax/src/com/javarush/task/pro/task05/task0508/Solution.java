package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;


public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        // заполнть массив сток из консоли, если есть одинаковые стороки
        //удалить их и вернуть null
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        strings = new String[size];
        String[] array;

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
            if (strings[i].equals(strings))
                strings = new String[6];
            System.out.print(strings[i] + ", ");
        }

    }
}
