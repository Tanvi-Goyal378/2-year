import java.util.*;
class height{
    public static void main(String[] args){
       Scanner obj =new Scanner(System.in);
       System.out.print("enter height ");
       double height=obj.nextDouble();
       double inches=height/2.54;
       double feet=inches/12;
       System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches); 
    }
}