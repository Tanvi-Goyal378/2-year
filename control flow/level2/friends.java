import java.util.*;
class friends{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter amar's age: ");
        int a=obj.nextInt();
        System.out.print("enter amar's height: ");
        int p=obj.nextInt();
        System.out.print("enter akbar's age: ");
        int b=obj.nextInt();
        System.out.print("enter akbar's height: ");
        int q=obj.nextInt();
        System.out.print("enter anthony's age: ");
        int c=obj.nextInt();
        System.out.print("enter anthony's height: ");
        int r=obj.nextInt();
        if (a<b && a<c){
            System.out.println("Amar is yougest friend ");
        
             }
        else if (b<a && b<c) {
            System.out.println("Akbar is yougest friend ");
        }
        else{
            System.out.println("Anthony is yougest friend ");
        }
        if (p>q && p>r){
            System.out.println("Amar is tallest friend ");
        
             }
        else if (q>p && q>r) {
            System.out.println("Akbar is tallest friend ");
        }
        else{
            System.out.println("Anthony is tallest friend ");
        }

    }}