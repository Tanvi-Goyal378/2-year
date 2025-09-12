public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");

        v1.displayVehicleDetails();
        System.out.println("Registration Fee: $" + Vehicle.registrationFee);

        Vehicle.updateRegistrationFee(1200);
        System.out.println("Updated Registration Fee: $" + Vehicle.registrationFee);

        v2.displayVehicleDetails();
        System.out.println("Registration Fee: $" + Vehicle.registrationFee);
    }
}
