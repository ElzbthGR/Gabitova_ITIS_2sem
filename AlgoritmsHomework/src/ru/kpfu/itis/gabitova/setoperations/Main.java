package ru.kpfu.itis.gabitova.setoperations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SetOperations set = new SetOperations();
        List set1 = new ArrayList();
        List set2 = new ArrayList();
        set1.add(1);
        set1.add(5);
        set1.add(8);
        set1.add(3);
        set1.add(13);
        set2.add(5);
        set2.add(1);
        set2.add(4);
        set2.add(10);
        System.out.println(set.intersection(set1, set2));
        System.out.println(set.substraction(set1, set2));
        System.out.println(set.unit(set1, set2));
    }
}