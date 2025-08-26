import java.util.*;

class day {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter year = ");
        int y = obj.nextInt();

        System.out.print("Enter month (1-12) = ");
        int m = obj.nextInt();

        if (m < 1 || m > 12) {
            System.out.println("Invalid month");
            
        }
        System.out.print("Enter day (1-31) = ");
        int d = obj.nextInt();

        if (d < 1 || d > 31) {
            System.out.println("Invalid day");
            
        }
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;
        System.out.println(d0);}}

