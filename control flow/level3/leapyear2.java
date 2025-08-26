import java.util.*;
class leapyear2{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter year= ");
        int year=obj.nextInt();
        if(year>=1582){
            if((year%4==0 && year%100!=0)||year%400==0){
                System.out.println("Year is leap year");
            }
            else
                System.out.println("Year is not leap year");
        }
        else
            System.out.println("year is not corresponding to georgian calendar");
    }
}