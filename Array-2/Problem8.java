// Marks, percentage, grade
import java.util.*;
public class Problem8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] per=new double[n];
        String[] grade=new String[n];

        for(int i=0;i<n;i++){
            double p=sc.nextDouble(),c=sc.nextDouble(),m=sc.nextDouble();
            if(p<0||c<0||m<0){ i--; continue; }
            per[i]=(p+c+m)/3;

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
