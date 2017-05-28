import java.util.*;
/**
 * Created by Elizabeth on 25.05.2017.
 */
public class Heap<T extends Comparable<T>> {
    private T[] data;
    private int size;
    private Comparator<T> comparator;

    Heap(T[] data, Comparator<T> comparator) {
        this(data);
        this.comparator = comparator;
    }

    Heap(T[] data) {
        this.data = data;
        size = data.length;
    }

    public void pushUp(int index) {
        int parent = (index - 1) / 2;
        if (compareTo(data[index], data[parent]) > 0) {
            T temp = data[index];
            data[index] = data[parent];
            data[parent] = temp;
            pushUp(parent);
        }
    }

    private int compareTo(T t1, T t2) {
        if (comparator != null) {
            return comparator.compare(t1, t2);
        }
        return t1.compareTo(t2);
    }

    public void heapBuild() {
        for (int i = data.length / 2; i >= 0; i--) {
            pushDown(i);
        }
    }

    public void show() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void pushDown(int index) {
        int child1 = index * 2 + 1;
        int child2 = index * 2 + 2;
        int curr = child1;
        if (size > index * 2 + 2 && compareTo(data[child1], data[child2]) < 0)
            curr = child2;

        if (size > curr && compareTo(data[index], data[curr]) < 0) {
            T temp = data[index];
            data[index] = data[curr];
            data[curr] = temp;
            pushDown(curr);
        }
    }

    public void sort() {
        while (size > 0) {
            T curr = data[0];
            data[0] = data[size - 1];
            data[size - 1] = curr;
            size--;
            pushDown(0);
        }
    }

}
