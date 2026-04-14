import java.util.*;
class Program10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int p=sc.nextInt(),c=sc.nextInt(),m=sc.nextInt();
            int total=p+c+m;
            double per=total/3.0;
            String grade;
            if(per>=90) grade="A";
            else if(per>=75) grade="B";
            else if(per>=50) grade="C";
            else grade="F";
            System.out.println(total+" "+per+" "+grade);
        }
    }
}