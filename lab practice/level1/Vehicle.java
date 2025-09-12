public class Vehicle {
    static double registrationFee = 500.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "REG123");
        Vehicle v2 = new Vehicle("Bob", "Motorbike", "REG456");

        if (v1 instanceof Vehicle) {
            System.out.println("Owner: " + v1.ownerName);
            System.out.println("Type: " + v1.vehicleType);
            System.out.println("Registration Number: " + v1.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }

        if (v2 instanceof Vehicle) {
            System.out.println("Owner: " + v2.ownerName);
            System.out.println("Type: " + v2.vehicleType);
            System.out.println("Registration Number: " + v2.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }

        updateRegistrationFee(600.0);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
}
