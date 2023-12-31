package com.javarush.task.pro.task05.task0512;


import java.util.Arrays;

public class Solution {

    public static int[][][] multiArray1 = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {

         String s = Arrays.deepToString(multiArray1);
        System.out.println(s);
    }
}
