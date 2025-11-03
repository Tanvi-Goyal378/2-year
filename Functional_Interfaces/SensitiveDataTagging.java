interface SensitiveData {
    // Marker interface for sensitive data
}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "UserCredentials{username='" + username + "', password='" + password + "'}";
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        UserCredentials creds = new UserCredentials("alice", "secret123");

        if (creds instanceof SensitiveData) {
            System.out.println("⚠️ Sensitive data detected! Encrypt before storage.");
        } else {
            System.out.println("No sensitive data.");
        }
    }
}
