import java.util.*;
public class area{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("enter radius");
        int r=obj.nextInt();
        double area=3.14*r*r;
        System.out.println(area);
    }
    }