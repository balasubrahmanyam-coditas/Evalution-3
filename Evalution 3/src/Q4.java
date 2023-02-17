import java.sql.SQLOutput;

class Vehicle{
    public void members(){
        String company = "LLP solutions";
        int price = 233333;
        System.out.println("NAME OF COMPANY:"+company+"PRICE OF IT:"+price);
    }

}
class LightMotorVehicle extends Vehicle{
    public void members(){
        double mileage = 25.5;
        System.out.println("MILEAGE OF IT:"+mileage);
    }

}
class HeavyMotorVehicle extends Vehicle{
    public void members(){
        double capacityInTons = 345.23;
        System.out.println("TONS:"+capacityInTons);
    }

}
public class Q4 {
    public static void main(String[] args) {
        HeavyMotorVehicle heavyMotorVehicle = new HeavyMotorVehicle();
        heavyMotorVehicle.members();
        Vehicle vehicle = new Vehicle();
        vehicle.members();
        LightMotorVehicle lightMotorVehicle = new LightMotorVehicle();
        lightMotorVehicle.members();
    }
}
