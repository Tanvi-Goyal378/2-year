import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        try {
            System.out.println(names[n]); // this will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        try {
            System.out.println(names[n + 5]); // definitely out of bounds
        } catch (Exception e) {
            System.out.println("RuntimeException handled safely");
        }
    }
}
