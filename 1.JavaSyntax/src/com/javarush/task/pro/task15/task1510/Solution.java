package com.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);

             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            bufferedWriter.write(Arrays.toString(bytes));

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

