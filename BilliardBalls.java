import java.util.*;

/**
 * Created by Elizabeth on 25.05.2017.
 */
public class BilliardBalls {

    static private Heap heap = new Heap();
    static private Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x != 0){
            if (x == 1) {
                System.out.println(getMinBall_2());
            }
            if (x!=1) set.add(x);
            x = sc.nextInt();
        }
    }

    public void putBall(int value) {
        heap.add(value);
    }

    public int getMinBall() {
        return heap.min();
    }

    public static int getMinBall_2() {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterator.remove();
            return index;
        }
        return 0;
    }
}
