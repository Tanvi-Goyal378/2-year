import java.util.*;
class unitprice{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter unitprice");
        double price=obj.nextDouble();
        System.out.print("enter quantity");
        double qty=obj.nextDouble();
        double unitprice=qty*price;
        System.out.println("The total purchase price is "+unitprice+" if the quantity "+qty+" and unit price is "+price);
    }
}