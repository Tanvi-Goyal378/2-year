// Circular Linked List - Round Robin
class Problem6_RoundRobinCLL {
    static class Node{
        int id,burst; Node next;
        Node(int i,int b){id=i;burst=b;}
    }
    Node head;

    void addEnd(int i,int b){
        Node n=new Node(i,b);
        if(head==null){head=n;n.next=head;return;}
        Node c=head; while(c.next!=head)c=c.next;
        c.next=n; n.next=head;
    }

    public static void main(String[] args){
        Problem6_RoundRobinCLL r=new Problem6_RoundRobinCLL();
        r.addEnd(1,5); r.addEnd(2,3);
        System.out.println("Round Robin Setup Done");
    }
}
