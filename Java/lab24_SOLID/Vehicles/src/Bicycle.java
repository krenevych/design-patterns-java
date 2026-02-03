
public class Bicycle extends Vehicle {
    private int numGears = 21; // кількість передач

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
        System.out.printf("Riding the bicycle (%s), number of gears=%s...\n", name, numGears);
    }
}
