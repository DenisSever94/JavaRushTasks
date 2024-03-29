package com.javarush.task.pro.task15.task1512;

import javax.net.ssl.SSLContextSpi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());// передает строку из консоли в метод
        String result = outputStream.toString(); // переобразование из байтов в строку, дальше работать с этой строкой
        outputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(result);
        String revers = stringBuilder.reverse().toString();
        printSomething(revers);
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);

    }
}