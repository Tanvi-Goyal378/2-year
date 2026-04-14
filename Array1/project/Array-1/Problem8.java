import java.util.*;
class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++) if(n%i==0) list.add(i);
        for(int x:list) System.out.print(x+" ");
    }
}