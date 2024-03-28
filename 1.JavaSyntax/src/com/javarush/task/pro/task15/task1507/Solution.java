package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        try {
            List<String> list = Files.readAllLines(Path.of(string));
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }

        } catch (IOException e) {
            System.out.println("Файл не найден");

        }
    }
}

