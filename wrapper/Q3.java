import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Auto-boxing
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(8);
        list.add(12);

        int sum = 0;

        // Auto-unboxing
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
