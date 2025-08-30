import java.util.*;
class mean{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        double sum=0.0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        
        sum+=arr[i];}
        double mean=sum/size;
        System.out.println("mean height  of team: "+mean);

}}
