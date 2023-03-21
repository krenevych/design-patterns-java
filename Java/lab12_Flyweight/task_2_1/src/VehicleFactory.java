import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private final Map<String, Vehicle> vehicleCash = new HashMap<>();

    public Vehicle getVehicle(String vehicleType) {
        if (!vehicleCash.containsKey(vehicleType)) {
            if ("Car".equals(vehicleType)) {
                vehicleCash.put("Car", new Car());
            } else if ("Truck".equals(vehicleType)) {
                vehicleCash.put("Truck", new Truck());
            } else {
                throw new IllegalArgumentException("Vehicle type is undefined");
            }
        }

        return vehicleCash.get(vehicleType);
    }

}
