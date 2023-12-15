package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[22];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {


        int mid = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) { // проверяем делится ли массив

//                  array[i] = valueStart;// заполнить массив до половины start
//                } else {
//                    array[i] = valueEnd; //
//                    if (i <= mid) {
//                        array[i] = valueStart;
//                    } else {
//                        array[i] = valueEnd;

                    } System.out.println(Arrays.toString(array));
                }
            }
        }

