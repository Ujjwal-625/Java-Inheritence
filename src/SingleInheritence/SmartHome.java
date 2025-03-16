package SingleInheritence;



class Device{
    String deviceId;
    String Status;
    Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.Status= status;
    }
}

class Thermostat extends Device{
    String tempreatureSetting;
    Thermostat(String deviceId,String status,String tempreatureSetting){
        super(deviceId,status);
        this.tempreatureSetting=tempreatureSetting;
    }
    void displayStatus(){
        System.out.println("Device ID : "+deviceId);
        System.out.println("Status : "+Status);
        System.out.println("Tempreature Setting : "+tempreatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t1=new Thermostat("8jfds","working","Kelvin");
        t1.displayStatus();
    }
}
