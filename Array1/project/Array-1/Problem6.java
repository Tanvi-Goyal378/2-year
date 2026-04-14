import java.util.*;
class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        for(int i=0;i<11;i++) sum+=sc.nextDouble();
        System.out.println("Mean: "+(sum/11));
    }
}