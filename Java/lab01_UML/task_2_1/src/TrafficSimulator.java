import java.util.Random;

public class TrafficSimulator {
    public static void main(String[] args) {
        TrafficSimulator simulator = new TrafficSimulator();
        Vehicle car = simulator.createRandomCar();
        String type = car.getType();
        System.out.println("Type of vehicle is " + type);
        String resultRunTask = car.runTask();
        System.out.println("Resul of runTask: " + resultRunTask);
    }

    Vehicle createRandomCar() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b ? new Car() : new Truck();
    }
}
