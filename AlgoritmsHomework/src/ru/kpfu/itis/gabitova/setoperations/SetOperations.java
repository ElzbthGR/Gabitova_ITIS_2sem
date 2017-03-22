package ru.kpfu.itis.gabitova.setoperations;


import java.util.ArrayList;
import java.util.List;

public class SetOperations {
    private List result;

    List intersection(List set1, List set2) {
        result = new ArrayList();
        for (Object elem : set1) {
            if (set2.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    List substraction (List set1, List set2) {
        result = new ArrayList();
        for (Object elem : set1) {
            if (!set2.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    List unit (List set1, List set2) {
        result = set2;
        for (Object elem : set1) {
            if (!set2.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }
}
