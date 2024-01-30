package com.javarush.task.pro.task11.task1103;

/* 
Презентация роботов
*/

public class Robot {

    public static int robotCounter1;

    public int id;

    public String model;

    public int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter1;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter1, model, vendor, productionYear);
    }
}
