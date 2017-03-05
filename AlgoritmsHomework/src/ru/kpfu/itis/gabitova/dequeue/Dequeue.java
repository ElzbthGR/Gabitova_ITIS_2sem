package ru.kpfu.itis.gabitova.dequeue;

import java.util.LinkedList;

public class Dequeue {
    LinkedList list = new LinkedList();

    public void pushFront(Object o) {
        list.addFirst(o);
    }

    public void pushBack(Object o) {
        list.addLast(o);
    }

    public Object popFront() {
        return list.removeFirst();
    }

    public Object popBack() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }
}
