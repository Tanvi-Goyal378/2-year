import java.util.*;
class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        int[] arr=new int[r*c]; int k=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[k++]=mat[i][j];
        for(int x:arr) System.out.print(x+" ");
    }
}