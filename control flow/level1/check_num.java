import java.util.*;
class check_num{
    public static void main(String[] args){
        System.out.print("Enter number= ");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        if (num>0){
            System.out.println("The number is positive"); 
        }
        else if (num<0)
            System.out.println("The number is negative"); 
        else{
            System.out.println("The number is Zero"); 
            
        }
    }
}