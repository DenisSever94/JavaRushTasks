package com.javarush.task.pro.task06.task0603;

/*
Любимое блюдо
*/

public class Solution {

    public static void main(String[] args) {
        String firstname1 = "Ольга";
        String lastname = "Киприяновна";
        String favouritedish = "Пельмени";
        printPersonInfo(firstname1, lastname, favouritedish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }

}
