package com.javarush.task.pro.task10.task1016;


public class Solution {

    public static void showWeather(City city) {
        String string = String.format("В городе %s сегодня температура воздуха %d",
                city.getName(), city.getTemperature());
        System.out.println(string);


    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }
}
