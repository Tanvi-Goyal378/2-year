// Singly Linked List - Social Media
class Problem7_SocialSLL {
    static class Node{
        int id; String name; Node next;
        Node(int i,String n){id=i;name=n;}
    }
    Node head;

    void addUser(int i,String n){
        Node t=new Node(i,n);
        if(head==null){head=t;return;}
        Node c=head; while(c.next!=null)c=c.next; c.next=t;
    }

    void display(){
        Node c=head;
        while(c!=null){System.out.println(c.id+" "+c.name);c=c.next;}
    }

    public static void main(String[] args){
        Problem7_SocialSLL s=new Problem7_SocialSLL();
        s.addUser(1,"A"); s.addUser(2,"B");
        s.display();
    }
}
