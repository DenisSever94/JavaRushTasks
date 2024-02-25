package com.javarush.task.pro.task10.task1009;

/* 
Сравнение строк
*/

public class Solution {

    public static void main(String[] args) {
        String s = new String("JavaRush");
        s = "JavaRush";
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s == s3);
        System.out.println(s2.equals(s3));
    }
}
