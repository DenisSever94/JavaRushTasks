package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(string))) {
                while (bufferedReader.ready()) {
                    String line = bufferedReader.readLine();
                    System.out.println(line);
                    bufferedReader.close();

                }

            } finally {
                scanner.close();

            }
        }
    }
}
