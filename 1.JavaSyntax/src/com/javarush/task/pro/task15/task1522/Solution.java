package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://dan-it.gitlab.io/fs-book/java-basic/io/path.html");
        try (InputStream inputStream = url.openStream()) {
            byte[] buffer = inputStream.readAllBytes();
            String str = new String(buffer);
            System.out.println(str);

        }
    }
}



