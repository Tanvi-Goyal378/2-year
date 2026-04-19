
class DNode {
    int data;
    DNode next, prev;
    DNode(int data){ this.data = data; }
}

public class DequeLinkedList {
    DNode front, rear;

    public void addFront(int x){
        DNode n = new DNode(x);
        if(front == null){
            front = rear = n;
        } else {
            n.next = front;
            front.prev = n;
            front = n;
        }
    }

    public void addRear(int x){
        DNode n = new DNode(x);
        if(rear == null){
            front = rear = n;
        } else {
            rear.next = n;
            n.prev = rear;
            rear = n;
        }
    }

    public int removeFront(){
        if(front == null) throw new RuntimeException("Empty Deque");
        int val = front.data;
        front = front.next;
        if(front != null) front.prev = null;
        return val;
    }
}
