interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String password1 = "StrongP@ss1";
        String password2 = "weakpass";

        System.out.println(password1 + " -> " + SecurityUtils.isStrongPassword(password1));
        System.out.println(password2 + " -> " + SecurityUtils.isStrongPassword(password2));
    }
}
