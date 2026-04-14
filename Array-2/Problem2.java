// Youngest and tallest friend
import java.util.*;
public class Problem2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] height=new double[3];

        for(int i=0;i<3;i++){
            System.out.print("Age of "+names[i]+": ");
            age[i]=sc.nextInt();
            System.out.print("Height of "+names[i]+": ");
            height[i]=sc.nextDouble();
        }

        int y=0,t=0;
        for(int i=1;i<3;i++){
            if(age[i]<age[y]) y=i;
            if(height[i]>height[t]) t=i;
        }

        System.out.println("Youngest: "+names[y]);
        System.out.println("Tallest: "+names[t]);
    }
}
