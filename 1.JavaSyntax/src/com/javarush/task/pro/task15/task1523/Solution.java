package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);
        try (OutputStream outputStream = urlConnection.getOutputStream()) {
            outputStream.write(1);
            try (InputStream inputStream = urlConnection.getInputStream()) {
                byte[] buffer = inputStream.readAllBytes();
                String string = new String(buffer);
                System.out.println(string);

            }

        }

    }
}

