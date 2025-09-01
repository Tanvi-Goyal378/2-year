import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            char ch = text.charAt(text.length());
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
        }

        try {
            char ch = text.charAt(100);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("RuntimeException handled safely");
        }
    }
}
