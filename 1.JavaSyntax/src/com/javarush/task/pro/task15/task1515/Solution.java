package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Path path = Path.of(str);
        Path path1 = path.isAbsolute() ? path : path.toAbsolutePath();
        System.out.println(path1);


    }
}

