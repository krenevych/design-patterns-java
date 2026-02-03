public class Car extends Vehicle {

    private int numSeats = 4;

    public Car(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }
    
    // Інші методи класу Car
}
