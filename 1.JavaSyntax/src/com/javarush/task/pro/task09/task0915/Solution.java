package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

        String packagePath = "java.util.stream"; // это строка которая будет делиться
        String[] tokens = getTokens(packagePath, "\\."); // это массив в который сохраняется строка и его делитель
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer str = new StringTokenizer(query, delimiter); // создает новый объект и в него передается сторка и делитель
        String[] sr = new String[str.countTokens()]; // создается новый массив для хранения подстрок , размер задается колличеством токенов в строке
        for (int i = 0; i < sr.length; i++) { // цикл пробегается по всей длине массива и заполняет новый массив подстроками
            sr[i] = str.nextToken();
        }
        return sr;


    }
}