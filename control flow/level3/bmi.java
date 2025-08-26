import java.util.*;
class bmi{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter weight");
        double weight=obj.nextDouble();
        System.out.print("enter height");
        double height=obj.nextDouble();
        double bmi=weight/(height*height);
        if(bmi<=18.4)
            System.out.println("Underweight");
        else if(bmi<=24.9)
            System.out.println("normal");
        else if(bmi<=39.9)
            System.out.println("Overweight");
        else
            System.out.println("obese");
    }
}