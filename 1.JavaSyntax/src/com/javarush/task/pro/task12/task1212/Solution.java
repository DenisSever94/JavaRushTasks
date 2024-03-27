package com.javarush.task.pro.task12.task1212;

public class Solution {

    public static void main(String[] args) {
        CustomStringArrayList customStringArrayList = new CustomStringArrayList();
        for(int i = 0; i < 21; i++) {
            customStringArrayList.add("count" + i);
        }
    }
}
