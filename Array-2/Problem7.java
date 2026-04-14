// BMI using 2D array
import java.util.*;
public class Problem7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] data=new double[n][3];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            data[i][2]=data[i][0]/(data[i][1]*data[i][1]);
            if(data[i][2]<18.5) status[i]="Underweight";
            else if(data[i][2]<25) status[i]="Normal";
            else status[i]="Overweight";
        }

        for(int i=0;i<n;i++){
            System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+status[i]);
        }
    }
}
