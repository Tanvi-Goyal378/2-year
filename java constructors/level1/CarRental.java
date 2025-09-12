public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay = 1000;

    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Rahul", "Toyota", 5);

        System.out.println("Rental 1 cost: $" + cr1.calculateTotalCost());
        System.out.println("Rental 2 cost: $" + cr2.calculateTotalCost());
    }
}
