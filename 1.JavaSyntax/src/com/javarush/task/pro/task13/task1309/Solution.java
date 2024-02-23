package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Сергей Иванов", 4.4);
        grades.put("Федор Кузьмин", 2.3);
        grades.put("Никулин Владислав", 4.6);
        grades.put("Антон Фнтохин", 5.0);
        grades.put("Роман Кузбекович", 2.4);
    }
}
