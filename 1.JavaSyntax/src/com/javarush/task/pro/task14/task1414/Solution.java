package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
    StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement s: stackTrace) {
            System.out.printf(OUTPUT_FORMAT, s.getMethodName(), s.getLineNumber(), s.getClassName(), s.getFileName());
        }// меняем принтл на принтФ и через точку у s которая хранит данные стека вызываем методы стека
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
