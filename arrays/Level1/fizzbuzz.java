import java.util.*;
class fizzbuzz{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int num=obj.nextInt();
        String[] arr= new String[num+1];
        for(int i=0;i<=num;i++){
            if(i%3==0 && i%5==0 && i != 0 ){
                arr[i]= "FizzBuzz";
            }
            else if (i%3==0 && i != 0){
                arr[i]="Fizz";}
            else if (i%5==0 && i != 0 ){
                arr[i]="Buzz";
            }
            else
                arr[i]=String.valueOf(i);
        }
        for(int i=0;i<=num;i++){
            System.out.println(i+"="+arr[i]);
        }
    }
}