
public class Bicycle extends Vehicle {
    private int numGears; // кількість передач

    public Bicycle(String name) {
        super(name);
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    @Override
    public void drive() {
        throw new IllegalStateException("Bicycles can't drive!");
    }

    public void ride() {
        System.out.println("Riding a bicycle...");
    }
}
