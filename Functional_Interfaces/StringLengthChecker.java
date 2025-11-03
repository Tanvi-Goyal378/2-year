import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        String message = "Hello, this is a sample message for checking length!";
        int limit = 50;

        Function<String, Integer> getLength = String::length;

        int length = getLength.apply(message);
        if (length > limit) {
            System.out.println("⚠️ Message exceeds limit! Length: " + length);
        } else {
            System.out.println("✅ Message is within limit. Length: " + length);
        }
    }
}
