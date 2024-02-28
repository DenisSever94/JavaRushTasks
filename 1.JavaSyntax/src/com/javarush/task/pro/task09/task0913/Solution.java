package com.javarush.task.pro.task09.task0913;

/* 
Поиск в строке
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(s, word);
        int indexFromLastWord = getIndexFromLastWord(s, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        int index = string.indexOf(word);
        return index;

    }

    public static int getIndexFromLastWord(String string, String word) {
        int index = string.lastIndexOf(word);
        return index;
    }
}
