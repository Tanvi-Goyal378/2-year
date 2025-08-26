import java.util.*;
class smallest{
    public static void main(String[] args){
        System.out.print("Enter first number");
        Scanner obj=new Scanner(System.in);
        int first=obj.nextInt();
        System.out.print("Enter second number");
        int second=obj.nextInt();
        System.out.println("Enter third number");
        int third=obj.nextInt();
        if (first<second && first<third){
            System.out.println("first number is the smallest "+first);
        
             }
        else if (second<first && second<third) {
            System.out.println("second number is the smallest "+second);
        }
        else{
            System.out.println("Third number is the smallest "+third);
        }

        
    }
}