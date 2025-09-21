public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Maruti Swift", 180);

        System.out.println("Electric Vehicle:");
        System.out.println("Model: " + ev.model);
        System.out.println("Max Speed: " + ev.maxSpeed + " km/h");
        ev.charge();
        System.out.println();

        System.out.println("Petrol Vehicle:");
        System.out.println("Model: " + pv.model);
        System.out.println("Max Speed: " + pv.maxSpeed + " km/h");
        pv.refuel();
    }
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Charging the electric vehicle...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}
