package com.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 98; i++) {

        }
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return (int) (Math.random() * 99);
    }

}
