import java.util.*;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        List<Double> temperatures = Arrays.asList(36.5, 38.2, 39.5, 37.0, 40.1);

        double threshold = 38.0;
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        temperatures.stream()
                    .filter(isHighTemperature)
                    .forEach(temp -> System.out.println("⚠️ High Temperature Alert: " + temp + "°C"));
    }
}
