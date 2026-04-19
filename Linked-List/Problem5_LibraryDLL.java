// Doubly Linked List - Library
class Problem5_LibraryDLL {
    static class Node{
        int id; String title; Node prev,next;
        Node(int i,String t){id=i;title=t;}
    }
    Node head,tail;

    void addEnd(int i,String t){
        Node n=new Node(i,t);
        if(head==null){head=tail=n;return;}
        tail.next=n;n.prev=tail;tail=n;
    }

    int count(){
        int c=0; Node cur=head;
        while(cur!=null){c++;cur=cur.next;}
        return c;
    }

    public static void main(String[] args){
        Problem5_LibraryDLL l=new Problem5_LibraryDLL();
        l.addEnd(1,"Book1"); l.addEnd(2,"Book2");
        System.out.println(l.count());
    }
}
