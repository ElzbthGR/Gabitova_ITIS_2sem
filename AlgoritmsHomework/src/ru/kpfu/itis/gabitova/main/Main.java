package ru.kpfu.itis.gabitova.main;

import ru.kpfu.itis.gabitova.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
