package com.javarush.task.pro.task15.task1514;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Path path = Path.of(str1);
        Path path1 = Path.of(str2);
        try {


            Path path2 = path.relativize(path1);
            System.out.println(path2);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}

