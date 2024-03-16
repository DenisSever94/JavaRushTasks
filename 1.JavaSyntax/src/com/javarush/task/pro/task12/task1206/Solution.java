package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string1 = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string1));
        System.out.println("Количество букв в строке : " + countLetters(string1));
        System.out.println("Количество пробелов в строке : " + countSpaces(string1));
    }

    public static int countDigits(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))
                count++;
        }
        return count;
    }


    public static int countLetters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
            count++;
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i)))
            count++;
        }
        return count;
    }
}

