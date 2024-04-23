package com.javarush.task.pro.task16.task1602;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Подчищаем хвосты
*/

public class Solution {

    public static void main(String[] args) {
        List<Date> dateArrayList = new ArrayList<>();
        dateArrayList.add(new Date(2015, 12, 25, 20, 40));
        dateArrayList.add(new Date("July 20, 1969"));
        dateArrayList.add(new Date(1989, 11, 9));
        dateArrayList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateArrayList.forEach(System.out::println);

        fixDate(dateArrayList);

        System.out.println("after fixes:");
        dateArrayList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        Date currentDate = new Date();
        for (int i = 0; i < brokenDates.size(); i++) {
            Date date = brokenDates.get(i);
            if (date.after(currentDate)) {
                date.setYear(date.getYear() - 1900);
                date.setMonth(date.getMonth() - 1);
            }

        }

    }
}
