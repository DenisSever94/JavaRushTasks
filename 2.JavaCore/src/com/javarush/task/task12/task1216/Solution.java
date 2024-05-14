package com.javarush.task.task12.task1216;


public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        String getName();

        default String move() {
            return null;
        }

    }


}
