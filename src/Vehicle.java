public class Vehicle {
    int maxSpeed ;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    void displayVehicleDetails(){
        System.out.println("MaxSpeed : "+maxSpeed);
        System.out.println("FuelType : "+fuelType);
    }

    public static void main(String[] args) {
        Vehicle [] arr=new Vehicle[10];

        //implementing polymorphism

        arr[0]=new Car(120,"Petrol");
        arr[1]=new Truck(80,"Deisel");
        arr[2]=new MotorCycle(100,"petrol");

        arr[0].displayVehicleDetails();
        arr[1].displayVehicleDetails();
        arr[2].displayVehicleDetails();
    }
}

class Car extends Vehicle{
    Car(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }

}

class Truck extends Vehicle{
    Truck(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }

}

class MotorCycle extends Vehicle{
    MotorCycle(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }
}
