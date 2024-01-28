package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
*/

public class Solution {

    private int currentYear1;


    public  Solution() {
        this.currentYear1 = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear1() {
        return currentYear1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear1());
    }
}
