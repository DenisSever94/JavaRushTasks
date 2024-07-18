package com.javarush.task.pro.task06.task0610;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

public String getFullName(){
        return firstName + " " + lastName;
    }
}
