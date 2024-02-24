package com.javarush.task.pro.task13.task1318;


public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
      Month[] months = Month.values();
      int nextOrdinal = (month.ordinal() + 1 ) % months.length;
      return months[nextOrdinal];
    }
}
