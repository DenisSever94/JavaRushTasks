package com.javarush.task.pro.task10.task1010;

/*
Два айфона
*/

public class Iphone {
    private String model1;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model1 = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object objects) {
        if (this == objects)
            return true;

        if (objects == null)
            return false;

        if (!(objects instanceof Iphone))
            return false;
        Iphone iphone = (Iphone) objects;
        return this.model1 == iphone.model1 &&
                this.color == iphone.color &&
                this.price == iphone.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

