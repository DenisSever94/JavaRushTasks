package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("понедельник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if ("Понедельник".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Monday";
        } else if ("Вторник".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Tusday";
        } else if ("Среда".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Wednesday";
        } else if ("Четверг".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Thursday";
        } else if ("Пятница".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Friday";
        } else if ("Суббота".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Saturday";
        } else if ("Воскресеньк".equalsIgnoreCase(ru.toLowerCase())) {
            en = "Sunday";
        } else en = "Недействительный день недели";
        return en;


//        switch (ru.toLowerCase()) {
//            case "понедельник":
//                en = "Monday";
//                break;
//            case "вторник":
//                en = "Tuesday";
//                break;
//            case "среда":
//                en = "Wednesday";
//                break;
//            case "четверг":
//                en = "Thursday";
//                break;
//            case "пятница":
//                en = "Friday";
//                break;
//            case "суббота":
//                en = "Saturday";
//                break;
//            case "воскресенье":
//                en = "Sunday";
//                break;
//            default:
//                en = "Недействительный день недели";
//        }
//        return en;

    }
}
