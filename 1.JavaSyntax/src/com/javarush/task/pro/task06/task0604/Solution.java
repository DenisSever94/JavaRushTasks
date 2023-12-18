package com.javarush.task.pro.task06.task0604;

/* 
Ливерпульская четверка
*/

public class Solution {
    public static void main(String[] args) {
        String джон = "Джон";
        String пол = "Пол";
        String secondpilot = "Джордж";
        String ринго = "Ринго";
        createCrew(джон, пол, secondpilot, ринго);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пилот: " + pilot);
        System.out.println("Второй пилот: " + secondPilot);
        System.out.println("Бортинженер: " + flightEngineer);
    }
}
