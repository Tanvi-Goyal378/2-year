import java.util.Scanner;
class Program7 {
    static void generate(String s){
        int x=Integer.parseInt(s);
        System.out.println(x);
    }
    static void handle(String s){
        try{
            int x=Integer.parseInt(s);
            System.out.println(x);
        }catch(NumberFormatException e){
            System.out.println("Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //generate(s);
        handle(s);
    }
}