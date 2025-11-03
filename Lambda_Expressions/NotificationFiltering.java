import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Info", "Patient checkup scheduled."),
            new Alert("Warning", "Low oxygen level detected."),
            new Alert("Critical", "Emergency in ICU!")
        );

        String userPreference = "Critical"; // Try "Warning" or "Info"

        Predicate<Alert> filter = alert -> alert.type.equalsIgnoreCase(userPreference);

        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);
    }
}
