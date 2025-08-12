import java.util.*;
public class parameter{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("enter length");
        int l=obj.nextInt();
        System.out.print("enter breadth");
        int b=obj.nextInt();
        int parameter=2*(l+b);
        System.out.println(parameter);
    }
    }