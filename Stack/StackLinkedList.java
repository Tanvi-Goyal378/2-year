
class Node {
    int data;
    Node next;
    Node(int data){ this.data = data; }
}

public class StackLinkedList {
    Node top;

    public void push(int x){
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    public int pop(){
        if(top == null) throw new RuntimeException("Stack Underflow");
        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek(){
        if(top == null) throw new RuntimeException("Empty Stack");
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
