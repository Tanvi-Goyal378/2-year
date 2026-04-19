// Singly Linked List - Inventory
class Problem4_InventorySLL {
    static class Node{
        int id,qty; String name; double price; Node next;
        Node(int i,String n,int q,double p){id=i;name=n;qty=q;price=p;}
    }
    Node head;

    void addEnd(int i,String n,int q,double p){
        Node t=new Node(i,n,q,p);
        if(head==null){head=t;return;}
        Node c=head; while(c.next!=null)c=c.next; c.next=t;
    }

    double totalValue(){
        double sum=0; Node c=head;
        while(c!=null){sum+=c.qty*c.price;c=c.next;}
        return sum;
    }

    public static void main(String[] args){
        Problem4_InventorySLL i=new Problem4_InventorySLL();
        i.addEnd(1,"Item1",2,50);
        i.addEnd(2,"Item2",1,100);
        System.out.println(i.totalValue());
    }
}
