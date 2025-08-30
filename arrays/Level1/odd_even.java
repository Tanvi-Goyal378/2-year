import java.util.*;
class odd_even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] oddarr = new int[size/2+1];
        int[] evenarr = new int[size/2+1];
        int odd=0;
        int even=0;
        int i=0;
        for(i=0; i<=size;i++){
            if (i%2!=0){
                oddarr[odd]=i;
                odd++;
            }
            else{
                evenarr[even]=i;
                even++;
            }
        }
        System.out.println("even numbers:");
        for( i=0;i<even;i++){
            System.out.print(evenarr[i]+" ");
        }
        System.out.println("\nodd numbers");
        for( i=0;i<even;i++)
        {
            System.out.print(oddarr[i]+" ");
        }
    }}