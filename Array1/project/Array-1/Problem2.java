import java.util.*;
class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for (int num : arr) {
            if (num > 0)
                System.out.println(num + (num%2==0 ? " even" : " odd"));
            else if (num < 0)
                System.out.println(num + " negative");
            else
                System.out.println("Zero");
        }
        System.out.println(arr[0]==arr[4]?"Equal":arr[0]>arr[4]?"First greater":"Last greater");
    }
}