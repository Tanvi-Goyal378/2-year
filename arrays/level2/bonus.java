import java.util.*;
class bonus{
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("enter number of employees: ");
    int size =obj.nextInt();
    double[] salary = new double[size];
    int[] year = new int[size];
    for(int i=0;i<size;i++){
        System.out.print("enter "+i+" salary: ");
        salary[i]=obj.nextDouble();
        System.out.print("enter "+i+" year: ");
        year[i]=obj.nextInt();
        

    }
    for(int i=0;i<size;i++){
         double bonus=0;
        if(year[i]>=5){
             bonus=(salary[i]/5)*100;
        }
        else if(year[i]<5 && year[i]>0){
            bonus=(salary[i]/2)*100;
        }
        else
            System.out.println("No bonus");
    System.out.println("bonus of "+i+" employee is "+bonus+" since they working from "+year[i]+" year");
    }
}}