
class Node {
    int data;
    Node next;
    Node(int data){ this.data = data; }
}

public class QueueLinkedList {
    Node front, rear;

    public void enqueue(int x){
        Node n = new Node(x);
        if(rear == null){
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    public int dequeue(){
        if(front == null) throw new RuntimeException("Queue Underflow");
        int val = front.data;
        front = front.next;
        if(front == null) rear = null;
        return val;
    }

    public boolean isEmpty(){
        return front == null;
    }
}
