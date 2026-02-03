public class Car extends Vehicle {

    private int numSeats = 4;

    final private GasolineEngine engine;

    public Car(String name) {
        super(name);

        this.engine = new GasolineEngine();
    }

    @Override
    public void drive() {
        System.out.printf("Driving the car (%s), engine=%s, seats=%s...\n", name, engine, numSeats);
    }
    
    // Інші методи класу Car
}
