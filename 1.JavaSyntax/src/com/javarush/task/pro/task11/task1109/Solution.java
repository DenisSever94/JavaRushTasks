package com.javarush.task.pro.task11.task1109;



public class Solution {
    public static void main(String[] args) {
        Outer outer1 = new Outer();
        Outer.Inner inner = outer1.new Inner();
        Outer.Nested nested = new Outer.Nested();

    }
}
