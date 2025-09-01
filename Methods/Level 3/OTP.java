import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OTP {

    public static int getOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean checkUnique(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int val : arr) {
            if (!s.add(val)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = getOTP();
        }
        System.out.println(Arrays.toString(otps));
        System.out.println(checkUnique(otps));
    }
}
