package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
//        Scanner name = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        int yourAge = console.nextInt();

        if (yourAge >= 18 && yourAge <= 28)  {
            System.out.println(name + militaryCommissar);

        }

    }
}
