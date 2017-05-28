/**
 * Created by Elizabeth on 25.05.2017.
 */
public class BinaryTree <T1 extends Comparable<T1>,T2> {
    protected Node <T1, T2> root = null;

    static class Node <T1, T2> {
        T1 key;
        T2 value;

        Node <T1, T2> left, right;

        Node(T1 key, T2 value) {
            this.key = key;
            this.value = value;
        }
    }

    public T2 get(T1 k) {
        Node <T1, T2> x = root;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                return x.value;
            }
            if (cmp < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return null;
    }

    public void add(T1 k, T2 v) {
        Node<T1, T2> x = root, y = null;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                x.value = v;
                return;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }
        Node <T1, T2> newNode = new Node<T1, T2>(k, v);
        if (y == null) {
            root = newNode;
        } else {
            if (k.compareTo(y.key) < 0) {
                y.left = newNode;
            } else {
                y.right = newNode;
            }
        }
    }

    public void remove(T1 k) {
        Node <T1, T2> x = root, y = null;
        while (x != null) {
            int cmp = k.compareTo(x.key);
            if (cmp == 0) {
                break;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }
        if (x == null) {
            return;
        }
        if (x.right == null) {
            if (y == null) {
                root = x.left;
            } else {
                if (y.left == x) {
                    y.left = x.left;
                } else {
                    y.right = x.left;
                }
            }
        } else {
            Node <T1, T2> leftMost = x.right;
            y = null;
            while (leftMost.left != null) {
                y = leftMost;
                leftMost = leftMost.left;
            }
            if (y != null) {
                y.left = leftMost.right;
            } else {
                x.right = leftMost.right;
            }
            x.key = leftMost.key;
            x.value = leftMost.value;
        }
    }
}
