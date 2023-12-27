package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[6];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        
        int size = array.length / 2;

     if (array.length % 2 == 0) {
         Arrays.fill(array, 0, size, valueStart);
         Arrays.fill(array, size, array.length, valueEnd);
     }
     else Arrays.fill(array,0, size + 1, valueStart);
     Arrays.fill(array, size + 1, array.length, valueEnd);




        System.out.print(Arrays.toString(array));

        }
    }

