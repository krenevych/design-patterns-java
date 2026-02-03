abstract class Vehicle {

    final protected String name;
    protected String brand;
    protected int maxSpeed;

    public Vehicle(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void drive() {
        System.out.println("Just driving the vehicle...");
    }

    // Інші методи класу Vehicle
}
