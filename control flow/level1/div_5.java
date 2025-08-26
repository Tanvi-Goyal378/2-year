import java.util.*;
class div_5{
    public static void main(String[] args){
        System.out.print("Enter a number= ");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        if (num%5==0){
            System.out.println("Is the number "+num+" divisible by 5?" );
            System.out.println("Yes");
        }
        else{
            System.out.println("Is the number" +num +" divisible by 5? ");
            System.out.println("NO");
        }
    }
}