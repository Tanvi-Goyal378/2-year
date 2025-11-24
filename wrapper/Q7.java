import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices) {
            list.add(p); // auto-boxing
        }

        double max = Double.MIN_VALUE;
        double sum = 0;

        for (double price : list) { // auto-unboxing
            sum += price;
            if (price > max) max = price;
        }

        double avg = sum / list.size();

        System.out.println("Highest price: " + max);
        System.out.println("Average price: " + avg);
    }
}
