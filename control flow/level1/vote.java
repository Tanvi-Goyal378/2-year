import java.util.*;
class vote{
    public static void main(String[] args){
        System.out.print("Enter age= ");
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if (age>=18){
            System.out.println("The person's age is "+age+" and can vote." );
            
        }
        else{
            System.out.println("The person's age is "+age+" and cannot vote.");
            
        }
    }
}