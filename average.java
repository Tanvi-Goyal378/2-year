import java.util.*;
public class average{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("first no.");
        int a=obj.nextInt();
        System.out.print("second no.");
        int b=obj.nextInt();
        System.out.print("third no.");
        int c=obj.nextInt();
        double average=(a+b+c)/3;
        System.out.println(average);
    }
    }