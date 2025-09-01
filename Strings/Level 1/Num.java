import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        }

        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("RuntimeException handled safely");
        }
    }
}
