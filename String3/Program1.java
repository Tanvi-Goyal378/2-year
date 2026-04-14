import java.util.*;
class Program1{
    static String[][] bmi(double[][] arr){
        String[][] res=new String[arr.length][4];
        for(int i=0;i<arr.length;i++){
            double w=arr[i][0];
            double h=arr[i][1]/100.0;
            double bmi=w/(h*h);
            String status = (bmi<18.5)?"Underweight":(bmi<25)?"Normal":"Overweight";
            res[i][0]=String.valueOf(arr[i][1]);
            res[i][1]=String.valueOf(arr[i][0]);
            res[i][2]=String.format("%.2f",bmi);
            res[i][3]=status;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] arr=new double[10][2];
        for(int i=0;i<10;i++){
            arr[i][0]=sc.nextDouble();
            arr[i][1]=sc.nextDouble();
        }
        String[][] r=bmi(arr);
        for(String[] x:r){
            System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]);
        }
    }
}