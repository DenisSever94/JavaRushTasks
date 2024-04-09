package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

public class MyStack {

    private final List<String> stringLinkedList = new LinkedList<>();

    public void push(String s) {
        stringLinkedList.add(0, s);

    }

    public String pop() {

        return stringLinkedList.remove(0);

    }

    public String peek() {
        return stringLinkedList.get(0);
    }

    public boolean empty() {
        boolean s = stringLinkedList.isEmpty();
        return s;
    }

    public int search(String s) {
        return stringLinkedList.indexOf(s);
    }
}
