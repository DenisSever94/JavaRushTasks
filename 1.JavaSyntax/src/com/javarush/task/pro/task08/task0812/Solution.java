package com.javarush.task.pro.task08.task0812;

/* 
Swap по-новому
*/

public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair1 = new Pair(4, 5);
        System.out.println(pair1);
        pair1.swap();
        System.out.println(pair1);
    }
}
