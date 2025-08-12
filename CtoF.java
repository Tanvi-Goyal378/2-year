import java.util.*;
public class CtoF{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("enter temperature in celsius");
        int temp=obj.nextInt();
        int f=(temp*(9/5))+32;
        System.out.println(f);
    }
    }