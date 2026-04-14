import java.util.*;
class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){System.out.println("Invalid");return;}
        for(int i=1;i<=n;i++){
            if(i%2==0) System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            if(i%2!=0) System.out.print(i+" ");
        }
    }
}