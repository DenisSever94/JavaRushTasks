package com.javarush.task.pro.task15.task1518;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.DirectoryStream;

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args, Object DirectoryStream) throws IOException {


        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> dir =
                     Files.newDirectoryStream((directory))) {
            for (Path path : dir) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path.toString() + THIS_IS_FILE);
                } else if (Files.isDirectory(path))
                    System.out.println(path.toString() + THIS_IS_DIR);


            }
        }
    }

}


