package com.javarush.task.pro.task10.task1003;

public class Skyscraper {
    private int floorsCount;
    private String developer1;

    public Skyscraper() {
        this.floorsCount = 5;
        this.developer1 = "JavaRushDevelopment";

    }

    public Skyscraper(int floorsCount, String developer) {
      this.floorsCount = floorsCount;
      this.developer1 = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, " Неизвестно");
    }
}
