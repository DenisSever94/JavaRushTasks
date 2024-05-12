package com.javarush.task.task12.task1220;


public class Solution {
    public static void main(String[] args) {


    }

    abstract class Human implements CanRun, CanSwim {

    }


    interface CanRun {
        void run();

    }

    interface CanSwim {
        void swim();

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
