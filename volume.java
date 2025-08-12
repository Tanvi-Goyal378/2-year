import java.util.*;
public class volume{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in) ;
        System.out.print("enter radius");
        int r=obj.nextInt();
        System.out.print("enter height");
        int h=obj.nextInt();
        double volume=3.14 * r*r * h;
        System.out.println(volume);
    }
    }