import java.util.*;
class count{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a number");
        int number = obj.nextInt();
        int count=0;
        if (number==0){
            count=1;
        }else{
            while(number!=0){
                number/=10;
                count++;
            }
        }System.out.println("number of digits: "+count);
    }
}