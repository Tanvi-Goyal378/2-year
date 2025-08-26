import java.util.*;
class bonus2
{
    public static void main (String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("enter salary ");
        double salary=obj.nextDouble();
        System.out.print("enter year ");
        double year=obj.nextDouble();
        if (year>=5){
            double bonus=(salary*5)/100;
            double amount=salary+bonus;
            System.out.println("Final amount after bonus "+amount);
        }
        else{
            System.out.println("Not more than year 5");
        }
    }
}