import java.util.Scanner;
class Program6 {
    static void generate(String s){
        System.out.println(s.substring(5,2));
    }
    static void handle(String s){
        try{
            System.out.println(s.substring(5,2));
        }catch(Exception e){
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