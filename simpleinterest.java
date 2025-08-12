import java.util.*;
public class simpleinterest{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("enter principal");
        int p=obj.nextInt();
        System.out.print("enter rate");
        int r=obj.nextInt();
        System.out.print("enter time");
        int t=obj.nextInt();
        int si=(p * r * t) / 100;
        System.out.println(si);
    }
    }