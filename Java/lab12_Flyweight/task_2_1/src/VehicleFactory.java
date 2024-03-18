import java.util.HashMap;

public class VehicleFactory {

    final private HashMap<String, Vehicle> vehicleCash = new HashMap<>();

    public Vehicle getCar(String type){
        Vehicle vehicle = vehicleCash.get(type);
        if (vehicle == null){
            if(type.equals("Car")) {
                vehicle = new Car();
                vehicleCash.put("Car", vehicle);
            } else {
                vehicle = new Truck();
                vehicleCash.put("Truck", vehicle);
            }
        }
        return vehicle;
    }

}
