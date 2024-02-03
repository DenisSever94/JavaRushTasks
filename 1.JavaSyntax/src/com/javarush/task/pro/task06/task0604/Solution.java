package com.javarush.task.pro.task06.task0604;

/* 
Ливерпульская четверка
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot1 = "Пол";
        String secondPilot1 = "Джордж";
        String flightEngineer1 = "Ринго";
        createCrew(navigator, pilot1, secondPilot1, flightEngineer1);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пилот: " + pilot);
        System.out.println("Второй пилот: " + secondPilot);
        System.out.println("Бортинженер: " + flightEngineer);
    }
}
