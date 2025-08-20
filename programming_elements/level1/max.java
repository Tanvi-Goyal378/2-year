import java.util.*;
class max{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter value of students ");
        double n=obj.nextDouble();
        double max=(n*(n-1))/2;
        System.out.println("maximun number of handshakes"+max);
    }
}