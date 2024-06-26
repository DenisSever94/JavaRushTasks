package com.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Распаковка исключений
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager filemanager = new FileManager();

    public static void main(String[] args) {
        try {
            filemanager.copyFile("book.txt", "book_final_copy.txt");
            filemanager.copyFile("book_final_copy.txt", "book_last_copy.txt");
            throw new RuntimeException();
        } catch (RuntimeException runtimeException) {
            Throwable throwable = runtimeException.getCause();
            if (throwable instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (throwable instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);

            }
        }
    }
}
