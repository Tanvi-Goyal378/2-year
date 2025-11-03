interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        // Default empty implementation for non-electric vehicles
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("🚗 Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("⚡ Electric Car speed: 90 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("⚡ Battery: 75%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
