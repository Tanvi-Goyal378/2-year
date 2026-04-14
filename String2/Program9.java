import java.util.*;
class Program9{
    static String comp(){
        String[] arr={"rock","paper","scissors"};
        return arr[(int)(Math.random()*3)];
    }
    static String winner(String u,String c){
        if(u.equals(c)) return "Draw";
        if((u.equals("rock")&&c.equals("scissors"))||
           (u.equals("paper")&&c.equals("rock"))||
           (u.equals("scissors")&&c.equals("paper")))
           return "User";
        return "Computer";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int uw=0,cw=0;
        for(int i=0;i<n;i++){
            String u=sc.next();
            String c=comp();
            String w=winner(u,c);
            if(w.equals("User")) uw++;
            if(w.equals("Computer")) cw++;
            System.out.println(u+" "+c+" "+w);
        }
        System.out.println("User% "+(uw*100.0/n));
        System.out.println("Comp% "+(cw*100.0/n));
    }
}