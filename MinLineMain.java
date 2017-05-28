import java.util.Scanner;

/**
 * Created by Elizabeth on 25.05.2017.
 */

public class MinLineMain {
    public static void main(String[] args) {
        MinLine minLine = new MinLine();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int line = scanner.nextInt();

        for (int i = 0; i < line ; i++){
            minLine.add(scanner.nextInt());
        }
        for (int i = 0 ; i < length; i++){
            System.out.println(minLine.getMin());
            minLine.replace();
            minLine.add(scanner.nextInt());
        }
    }
}

