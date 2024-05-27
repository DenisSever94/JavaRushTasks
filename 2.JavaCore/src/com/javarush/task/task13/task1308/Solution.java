package com.javarush.task.task13.task1308;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
       default boolean isAlive(){
         return true;
       }
    }

    interface Presentable extends Person {
        @Override
        default boolean isAlive() {
            return Person.super.isAlive();
        }
    }
}