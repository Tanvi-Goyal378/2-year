
class PNode {
    int data;
    int priority;
    PNode next;
    PNode(int data, int priority){
        this.data = data;
        this.priority = priority;
    }
}

public class PriorityQueueLinkedList {
    PNode head;

    public void insert(int x, int p){
        PNode n = new PNode(x, p);

        if(head == null || p > head.priority){
            n.next = head;
            head = n;
        } else {
            PNode temp = head;
            while(temp.next != null && temp.next.priority >= p){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    public int remove(){
        if(head == null) throw new RuntimeException("Empty Queue");
        int val = head.data;
        head = head.next;
        return val;
    }
}
