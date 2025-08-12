import java.util.*;
public class power{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("enter base");
        int b=obj.nextInt();
        System.out.print("enter exponential");
        int e=obj.nextInt();
        double power=Math.pow(b,e);
        System.out.println(power);
    }
    }