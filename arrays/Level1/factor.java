import java.util.*;
class factor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] arr = new int[20];
        int j=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
              arr[j]=i;
                j++;  
            }                    }
        System.out.println("factors of "+num+" is: ");
        for( int i=0;i<j;i++){
            System.out.print(arr[i]+" ");}}}