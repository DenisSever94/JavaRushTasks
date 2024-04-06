package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String STRING = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
    StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement s: stackTrace) {
            System.out.printf(STRING, s.getMethodName(), s.getLineNumber(), s.getClassName(), s.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
