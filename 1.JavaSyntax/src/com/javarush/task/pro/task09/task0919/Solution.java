package com.javarush.task.pro.task09.task0919;

/* 
Разворот строки
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        int p1 = n1.nextInt();
        int p2 = n1.nextInt();
        int p3 = n1.nextInt();

        if (p1 == p2 && p2 == p3) {
            System.out.println(p1 + " " + p2 + " " + p3);

        } else if (p1 == p2) {
            System.out.println(p1 + " " + p2);
        } else if (p2 == p3) {
            System.out.println(p2 + " " + p3);
        } else if (p1 == p3) {
            System.out.println(p1 + " " + p3);
        }

        //напишите тут ваш код
    }
}
//        String string = "Ходит кот задом наперед";
//        System.out.println(string);
//        System.out.println(reverseString(string));
//    }
//
//    public static String reverseString(String string) {
//        StringBuilder stringBuilder = new StringBuilder(string);
//        return stringBuilder.reverse().toString();

