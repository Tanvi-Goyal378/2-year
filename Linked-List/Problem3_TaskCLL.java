// Circular Linked List - Task Scheduler
class Problem3_TaskCLL {
    static class Node{
        int id; String name; Node next;
        Node(int i,String n){id=i;name=n;}
    }
    Node head;

    void addEnd(int id,String name){
        Node n=new Node(id,name);
        if(head==null){head=n;n.next=head;return;}
        Node cur=head;
        while(cur.next!=head) cur=cur.next;
        cur.next=n; n.next=head;
    }

    void display(){
        if(head==null) return;
        Node cur=head;
        do{
            System.out.println(cur.id+" "+cur.name);
            cur=cur.next;
        }while(cur!=head);
    }

    public static void main(String[] args){
        Problem3_TaskCLL t=new Problem3_TaskCLL();
        t.addEnd(1,"Task1"); t.addEnd(2,"Task2");
        t.display();
    }
}
