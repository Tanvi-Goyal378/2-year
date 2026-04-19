// Doubly Linked List - Movie Management
class Problem2_MovieDLL {
    static class Node {
        String title, director; int year; double rating;
        Node prev,next;
        Node(String t,String d,int y,double r){title=t;director=d;year=y;rating=r;}
    }
    Node head,tail;

    void addEnd(String t,String d,int y,double r){
        Node n=new Node(t,d,y,r);
        if(head==null){head=tail=n;return;}
        tail.next=n; n.prev=tail; tail=n;
    }

    void displayForward(){
        Node c=head;
        while(c!=null){System.out.println(c.title+" "+c.rating);c=c.next;}
    }

    void displayReverse(){
        Node c=tail;
        while(c!=null){System.out.println(c.title+" "+c.rating);c=c.prev;}
    }

    public static void main(String[] args){
        Problem2_MovieDLL m=new Problem2_MovieDLL();
        m.addEnd("Movie1","Dir1",2020,4.5);
        m.addEnd("Movie2","Dir2",2021,4.0);
        m.displayForward();
        m.displayReverse();
    }
}
