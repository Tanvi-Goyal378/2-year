import java.util.*;
class marks{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter physics marks= ");
        int physics=obj.nextInt();
        System.out.print("enter chemistry marks= ");
        int chemistry=obj.nextInt();
        System.out.print("enter maths marks= ");
        int maths=obj.nextInt();
        int avg=(physics+chemistry+maths)/3;
        if(avg>=80 && avg<=100){
            System.out.println("A");
            System.out.println("above agency-normalized standards");
        }
        else if(avg>=70 && avg<=79){
            System.out.println("B");
            System.out.println("at agency-normalized standards");
        }
        else if(avg>=60 && avg<=69){
            System.out.println("C");
            System.out.println(" below.but approaching agency-normalized standards");
        }
        else if(avg>=50 && avg<=59){
            System.out.println("D");
            System.out.println("well below agency-normalized standards");
        }
        else if(avg>=40 && avg<=49){
            System.out.println("E");
            System.out.println("too below agency-normalized standards");
        }
        else{
            System.out.println("R");
            System.out.println("Remedial standards");
        }
    }
}