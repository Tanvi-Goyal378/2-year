
class CNode {
    int data;
    CNode next;
    CNode(int data){ this.data = data; }
}

public class CircularQueueLinkedList {
    CNode rear = null;

    public void enqueue(int x){
        CNode n = new CNode(x);
        if(rear == null){
            rear = n;
            rear.next = rear;
        } else {
            n.next = rear.next;
            rear.next = n;
            rear = n;
        }
    }

    public int dequeue(){
        if(rear == null) throw new RuntimeException("Queue Underflow");

        CNode front = rear.next;
        int val = front.data;

        if(rear == front){
            rear = null;
        } else {
            rear.next = front.next;
        }
        return val;
    }
}
