import java.util.Scanner;

public class Illegal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            String sub = text.substring(5, 3);
            System.out.println(sub);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
        }

        try {
            String sub = text.substring(3, 5);
            System.out.println(sub);
        } catch (Exception e) {
            System.out.println("RuntimeException handled safely");
        }
    }
}
