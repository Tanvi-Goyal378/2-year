import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default Format: " + DateFormatter.formatDate(today, "yyyy-MM-dd"));
        System.out.println("US Format: " + DateFormatter.formatDate(today, "MM/dd/yyyy"));
        System.out.println("Full Format: " + DateFormatter.formatDate(today, "EEEE, MMMM dd, yyyy"));
    }
}
