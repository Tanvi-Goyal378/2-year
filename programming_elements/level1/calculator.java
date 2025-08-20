import java.util.*;
class calculator{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("enter number1");
        double a=obj.nextDouble();
        System.out.print("enter number2");
        double b=obj.nextDouble();
        double add=a+b;
        double sub=a-b;
        double multi=a*b;
        double div=a/b;
        System.out.println("The addition,subtraction,multiplication and division value of 2 numbers"+a+"and"+b+"is"+add+sub+multi+"and"+div);


    }
    
}
