package com.javarush.task.pro.task16.task1609;

import java.time.LocalDate;

/* 
С годами моложе
*/

public class Solution {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2010, 3, 13);

        LocalDate jubilee30Years = localDate.minusYears(10);

        System.out.println(Math.abs(jubilee30Years.getYear()));
    }
}
