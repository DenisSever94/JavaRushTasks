package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary1 = 1000;

    public int getSalary1() {
        return salary1;
    }

    public void setSalary1(int salary1) {
        this.salary1 = salary1 > this.salary1 ? salary1 : this.salary1;
    }
}

