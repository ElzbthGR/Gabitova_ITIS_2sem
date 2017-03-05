package ru.kpfu.itis.gabitova.brackets;

import ru.kpfu.itis.gabitova.stack.Stack;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность скобок");
        String brackets = sc.nextLine();
        if (brackets.charAt(0) == '(') {
            stack.push(brackets.charAt(0));
            for (int i = 1; i < brackets.length(); i++) {
                char pos = brackets.charAt(i);
                if (pos == '(') {
                    stack.push(pos);
                }
                else if (pos == ')') {
                    if (stack.size() != 0) {
                        stack.pop();
                    }
                    else {
                        stack.push(pos);
                        break;
                    }
                }
                else {
                    stack.push(pos);
                    System.out.println("Неверный ввод");
                    break;
                }
            }
            if (stack.size() == 0) {
                System.out.println("Все верно");
            }
            else if(stack.top().equals(')') || stack.top().equals('(')){
                System.out.println("Неверно");
            }
        }
        else {
            System.out.println("Неверный ввод");
        }
    }
}
