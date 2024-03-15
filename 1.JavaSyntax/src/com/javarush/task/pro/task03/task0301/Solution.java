package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold1 = "на улице холодно";
        String warm = "на улице тепло";
        Scanner pogoda = new Scanner (System.in);
        int gradus = pogoda.nextInt();
        if (gradus < 0)
        System.out.println("на улице холодно");
        else 
        System.out.println("на улице тепло");
        
        //напишите тут ваш код
    }
}
