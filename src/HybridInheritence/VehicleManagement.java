package HybridInheritence;

class Vehicle {
    private String model;
    private int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Getter and Setter methods
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}

interface Refuelable {
    void refuel();  // Abstract method for refueling
}

class ElectricVehicle extends Vehicle {

    // Constructor
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println(getModel() + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    // Constructor
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    // Implementation of the refuel method from Refuelable interface
    public void refuel() {
        System.out.println(getModel() + " is being refueled.");
    }
}





public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 220);

        // Display information
        System.out.println(ev);  // Calls Vehicle's toString() method
        ev.charge();  // Electric vehicle charges

        System.out.println(pv);  // Calls Vehicle's toString() method
        pv.refuel();
    }
}
