package com.javarush.task.task12.task1224;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));

    }

    public static String getObjectType(Object o) {
        switch (o.getClass().getSimpleName()) {
            case "Cat":
                return "Кот";
            case "Tiger":
                return "Тигр";
            case "Lion":
                return "Лев";
            case "Bull":
                return "Бык";
            case "Pig":
                return "Свинья";

        }

        return "Животное";

    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
