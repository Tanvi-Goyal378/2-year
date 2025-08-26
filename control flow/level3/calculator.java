import java.util.*;
class calculator{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter 1st number");
        double num=obj.nextDouble();
        System.out.print("Enter 2nd number");
        double num1=obj.nextDouble();
        System.out.print("Enter operator");
        String op =obj.next();
        switch(op){
            case "+":
                System.out.println(num+num1);
                break;
            case "-":
                System.out.println(num-num1);
                break;
            case "*":
                System.out.println(num*num1);
                break;
            case "/":
                System.out.println(num/num1);
                break;
            default:
                System.out.println("invalid operator");
        }}}

