package com.javarush.task.pro.task12.task1213;

import java.util.ArrayList;


public class Solution {
    public static ArrayList<String> stringArrayList = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Звезда Смерти");
        print();
    }

    public static void createNewPlanet(String planetName) {
  stringArrayList.add(stringArrayList.indexOf("Земля") + 1, planetName);

    }

    public static void addPlanets() {
        stringArrayList.add("Меркурий");
        stringArrayList.add("Венера");
        stringArrayList.add("Земля");
        createNewPlanet("");
        stringArrayList.add("Марс");
        stringArrayList.add("Юпитер");
        stringArrayList.add("Сатурн");
        stringArrayList.add("Уран");
        stringArrayList.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(String.format("%s — %d-я планета от Солнца", stringArrayList.get(i), (i + 1)));
        }
        System.out.println();
    }
}
