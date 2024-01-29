package com.javarush.task.pro.task10.task1002;


public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT1 = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";


    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }


    public Skyscraper(int count) {

        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT1 + count);

    }


    public Skyscraper(String developer) {
      System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);



    }



    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");

    }
}

