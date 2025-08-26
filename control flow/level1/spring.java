import java.util.*;

class spring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter month (1-12) = ");
        int month = obj.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            
        }
        System.out.print("Enter day (1-31) = ");
        int day = obj.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Invalid day");
            
        }

        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month == 4 && day <= 30) {
            isSpring = true;
        } else if (month == 5 && day <= 31) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a spring season");
        } else {
            System.out.println("Not a spring season");
        }
    }
}
