 import java.util.*;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq); // [5, 10, 20]

        dq.removeFirst(); // removes 5
        dq.removeLast();  // removes 20

        System.out.println(dq); // [10]
    }
}