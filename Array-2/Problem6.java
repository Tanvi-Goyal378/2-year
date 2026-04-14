// BMI calculation
import java.util.*;
public class Problem6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] w=new double[n], h=new double[n], bmi=new double[n];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            w[i]=sc.nextDouble();
            h[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            bmi[i]=w[i]/(h[i]*h[i]);
            if(bmi[i]<18.5) status[i]="Underweight";
            else if(bmi[i]<25) status[i]="Normal";
            else status[i]="Overweight";
        }

        for(int i=0;i<n;i++){
            System.out.println(h[i]+" "+w[i]+" "+bmi[i]+" "+status[i]);
        }
    }
}
