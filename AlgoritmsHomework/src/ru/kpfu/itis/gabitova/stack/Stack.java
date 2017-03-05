package ru.kpfu.itis.gabitova.stack;

import java.util.ArrayList;

public class Stack {
    ArrayList array = new ArrayList();

    public void push(Object o) {
        array.add(o);
    }

    public Object top() {
        return array.get(array.size() - 1);
    }

    public Object pop() {
        array.remove(array.size() - 1);
        return array.size();
    }

    public int size() {
        return array.size();
    }
}
