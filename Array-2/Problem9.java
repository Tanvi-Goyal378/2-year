// Marks using 2D array
import java.util.*;
public class Problem9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] m=new double[n][3];
        double[] per=new double[n];
        String[] grade=new String[n];

        for(int i=0;i<n;i++){
            m[i][0]=sc.nextDouble();
            m[i][1]=sc.nextDouble();
            m[i][2]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            per[i]=(m[i][0]+m[i][1]+m[i][2])/3;
            if(per[i]>=90) grade[i]="A";
            else if(per[i]>=75) grade[i]="B";
            else if(per[i]>=50) grade[i]="C";
            else grade[i]="F";
        }

        for(int i=0;i<n;i++){
            System.out.println(per[i]+" "+grade[i]);
        }
    }
}
