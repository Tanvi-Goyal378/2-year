import java.util.*;
class parameter{
    public static void main(String[] args){
       Scanner obj =new Scanner(System.in);
       System.out.print("enter radius");
       double r=obj.nextDouble();
       double p=r*r*r*r;
       System.out.println(" The length of the side is "+r+"whose perimeter is "+p); 
    }
}