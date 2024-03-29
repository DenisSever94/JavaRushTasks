package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<String> list = Files.readAllLines(Path.of(string));
        list.stream().map(String::toCharArray).forEach(chars -> {
            for (char ch : chars) {
                if (ch != '.' && ch != ',' && ch != ' ') {
                    System.out.print(ch);
                }
            }
        });
    }
}

