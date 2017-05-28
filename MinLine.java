import java.util.Stack;
import static java.lang.Math.min;

/**
 * Created by Elizabeth on 25.05.2017.
 */
public class MinLine {
    Stack <Pair> stackFirst = new Stack<>();
    Stack <Pair> stackSecond = new Stack<>();

    public void add (int value){
        if (stackFirst.isEmpty()) {
            Pair pair = new Pair(value,value);
            stackFirst.push(pair);
        }
        else {
            Pair pair = new Pair(value, min(value, stackFirst.peek().Second));
            stackFirst.push(pair);
        }
    }
    public void replace (){
        if (stackSecond.isEmpty()){
            while (!stackFirst.isEmpty()){
                int element = stackFirst.peek().First;
                stackFirst.pop();
                int min = stackSecond.empty()? element: min (element , stackSecond.peek().Second);
                stackSecond.push(new Pair(element,min));
            }
        }
        stackSecond.pop();
    }

    public int getMin (){
        int currentMin;
        if (stackFirst.empty() || stackSecond.empty()){
            currentMin = stackFirst.empty() ? stackSecond.peek().Second: stackFirst.peek().Second;
        } else {
            currentMin = min(stackFirst.peek().Second, stackSecond.peek().Second);
        }
        return currentMin;
    }
    private static class Pair {
        int First;
        int Second;

        Pair(int First, int Second){
            this.First = First;
            this.Second = Second;
        }
    }
}

