import java.util.*;
class triangle{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter base");
        double b=obj.nextDouble();
        System.out.print("enter height");
        double h=obj.nextDouble();
        double area=(1*b*h)/2;
        System.out.println("your base"+b+"and height is"+h+"then area of triangle is"+area);
    }
}