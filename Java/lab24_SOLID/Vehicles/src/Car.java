class Car extends Vehicle {
    private int numSeats = 4;
    
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
    
    // Інші методи класу Car
}