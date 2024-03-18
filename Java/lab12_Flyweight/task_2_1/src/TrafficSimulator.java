import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulator {

  public static VehicleFactory vehicleFactory = new VehicleFactory();

  public static void main(String[] args) {

    Runnable useVehicle = new Runnable() {
      public void run() {
        createRandomCar();
      }
    };

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(useVehicle, 0, 2, TimeUnit.SECONDS);
  }

  private static void createRandomCar() {
    Random random = new Random();
    int randInt = random.nextInt(2);

    String vehicleType;
    if(randInt == 0) {
      vehicleType = "Car";
    } else {
      vehicleType =  "Truck";
    }

    Vehicle vehicle = vehicleFactory.getCar(vehicleType);

    System.out.println("Creating " + vehicle + ", type: " + vehicle.getType() + ", task: " + vehicle.runTask(random.nextInt(1000), random.nextInt(1000)));
  }


}
