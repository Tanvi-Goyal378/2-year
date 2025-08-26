import java.util.*;
class largest{
    public static void main(String[] args){
        System.out.print("Enter first number");
        Scanner obj=new Scanner(System.in);
        int first=obj.nextInt();
        System.out.print("Enter second number");
        int second=obj.nextInt();
        System.out.print("Enter third number");
        int third=obj.nextInt();
        if (first>second && first>third){
            System.out.println("first number is the largest "+first);
        
             }
        else if (second>first && second>third) {
            System.out.println("second number is the largest "+second);
        }
        else{
            System.out.println("Third number is the largest "+third);
        }

        
    }
}