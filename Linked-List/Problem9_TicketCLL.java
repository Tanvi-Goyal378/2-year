// Circular Linked List - Ticket System
class Problem9_TicketCLL {
    static class Node{
        int id; String name; Node next;
        Node(int i,String n){id=i;name=n;}
    }
    Node head;

    void addEnd(int i,String n){
        Node t=new Node(i,n);
        if(head==null){head=t;t.next=head;return;}
        Node c=head; while(c.next!=head)c=c.next;
        c.next=t; t.next=head;
    }

    int count(){
        if(head==null) return 0;
        int c=0; Node cur=head;
        do{c++;cur=cur.next;}while(cur!=head);
        return c;
    }

    public static void main(String[] args){
        Problem9_TicketCLL t=new Problem9_TicketCLL();
        t.addEnd(1,"A"); t.addEnd(2,"B");
        System.out.println(t.count());
    }
}
