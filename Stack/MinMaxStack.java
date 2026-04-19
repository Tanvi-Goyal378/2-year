
import java.util.Stack;

public class MinMaxStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public void push(int x){
        mainStack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);

        if(maxStack.isEmpty() || x >= maxStack.peek())
            maxStack.push(x);
    }

    public int pop(){
        if(mainStack.isEmpty()) throw new RuntimeException("Stack Underflow");

        int val = mainStack.pop();

        if(val == minStack.peek()) minStack.pop();
        if(val == maxStack.peek()) maxStack.pop();

        return val;
    }

    public int getMin(){
        return minStack.peek();
    }

    public int getMax(){
        return maxStack.peek();
    }
}
