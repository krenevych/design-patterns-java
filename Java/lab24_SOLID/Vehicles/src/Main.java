import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList<>();
    for (int i = 1; i <= 10; i++){
        if (i % 2 == 0){
            Car car = new Car();
            car.setBrand("Toyota");
            car.setMaxSpeed(200);
            vehicles.add(car);
        } else {
            Bicycle bicycle = new Bicycle();
            vehicles.add(bicycle);
            //
        }
    }

    for (Vehicle vehicle : vehicles) {
        vehicle.drive();
    }


//        Vehicle vehicle = new Car();
//        vehicle.setBrand("Toyota");
//        vehicle.setMaxSpeed(200);
//        vehicle.drive();  // Виводиться "Car is driving."
    }
}
