// Singly Linked List - Student Record Management
class Problem1_StudentSLL {
    static class Node {
        int roll, age;
        String name, grade;
        Node next;
        Node(int r,String n,int a,String g){roll=r;name=n;age=a;grade=g;}
    }
    Node head;

    void addEnd(int r,String n,int a,String g){
        Node t=new Node(r,n,a,g);
        if(head==null){head=t;return;}
        Node cur=head;
        while(cur.next!=null) cur=cur.next;
        cur.next=t;
    }

    void display(){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.roll+" "+cur.name+" "+cur.age+" "+cur.grade);
            cur=cur.next;
        }
    }

    public static void main(String[] args){
        Problem1_StudentSLL l=new Problem1_StudentSLL();
        l.addEnd(1,"A",20,"A");
        l.addEnd(2,"B",21,"B");
        l.display();
    }
}
