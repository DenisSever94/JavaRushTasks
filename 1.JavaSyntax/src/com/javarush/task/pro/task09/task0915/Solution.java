package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath1 = "java.util.stream";
        String[] tokens = getTokens(packagePath1, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer str = new StringTokenizer(query, delimiter);
        String[] sr = new String[str.countTokens()];
        for (int i = 0; i <sr.length; i++) {
            sr[i] = str.nextToken();
        }
        return sr;
    }
}
