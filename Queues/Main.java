import java.util.*;

class CircularQueue {
    int[] arr;
    int front = -1, rear = -1, size = 5;

    CircularQueue() {
        arr = new int[size];
    }

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int a = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return a;
    }
}

public class Main {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}