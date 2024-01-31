abstract class Vehicle {
    protected String brand;
    protected int maxSpeed;
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    abstract public void drive();
    
    // Інші методи класу Vehicle
}