package com.javarush.task.task12.task1204;


public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        System.out.println(o.getClass().equals(Cat.class) ? "Кошка" :
                o.getClass().equals(Bird.class) ? "Птица" :
                        o.getClass().equals(Lamp.class) ? "Лампа" :
                                o.getClass().equals(Dog.class) ? "Собака" : " ");


        }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
