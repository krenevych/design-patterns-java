class Bicycle extends Vehicle {
    private int numGears; // кількість передач
    
    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    @Override
    public void drive() {
        System.out.println("for Bicycle method 'ride' is used");
        throw new RuntimeException("drive: for Bicycle method 'ride' is used");
    }

    public void ride() {
        System.out.printf("Bicycle is riding. Used %d number of gear\n", numGears);
    }

    // Інші методи класу Bicycle
}