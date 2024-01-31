abstract class Vehicle {
    protected String brand;
    protected int maxSpeed;
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public void drive() {
        System.out.println("Vehicle is driving.");
    }
    
    // Інші методи класу Vehicle
}