package ru.kpfu.itis.gabitova.queue;

import java.util.LinkedList;

public class Queue {
    LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void push(Object o) {
        list.add(o);
    }

    public Object first() {
        return list.element();
    }

    public Object pop() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }
}

