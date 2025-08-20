import java.util.*;
class distance{
    public static void main(String[] args){
       Scanner obj =new Scanner(System.in);
       System.out.print("enter distance in feet ");
       double d=obj.nextDouble();
       double yard=d/3;
       double mile=yard/1760;
       System.out.println("the distance in feet"+d+"while in yards "+yard+"and in miles"+mile); 
    }
}