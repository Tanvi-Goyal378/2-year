// Doubly Linked List - Undo/Redo
class Problem8_UndoRedoDLL {
    static class Node{
        String state; Node prev,next;
        Node(String s){state=s;}
    }
    Node head,cur;

    void addState(String s){
        Node n=new Node(s);
        if(head==null){head=cur=n;return;}
        cur.next=n; n.prev=cur; cur=n;
    }

    void undo(){ if(cur.prev!=null) cur=cur.prev; }
    void redo(){ if(cur.next!=null) cur=cur.next; }

    public static void main(String[] args){
        Problem8_UndoRedoDLL u=new Problem8_UndoRedoDLL();
        u.addState("A"); u.addState("B");
        u.undo();
        System.out.println(u.cur.state);
    }
}
