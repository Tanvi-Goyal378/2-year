import java.util.Scanner;
class Program5 {
    static void generate(String s){
        System.out.println(s.charAt(100));
    }
    static void handle(String s){
        try{
            System.out.println(s.charAt(100));
        }catch(StringIndexOutOfBoundsException e){
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