package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);

    }

    public String pop() {

        return storage.remove(0);

    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        boolean s = storage.isEmpty();
        return s;
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
