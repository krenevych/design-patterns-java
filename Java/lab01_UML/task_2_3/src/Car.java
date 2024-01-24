public class Car extends Vehicle {

    final private String model;
    final private static int numberOfWheels = 4;
    final private Engine engine;

    private Wheel wheel;

    public Car(String model, Wheel wheel) {
        hasWheels = true;
        this.model = model;
        engine = new Engine(360);
        this.wheel = wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public float go(int seconds) {
        return this.engine.getPower() * seconds / 1000.0f;
    }
}
