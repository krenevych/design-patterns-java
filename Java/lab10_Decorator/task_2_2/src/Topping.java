abstract public class Topping extends Pizza {

    private final Pizza wrappee;

    public Topping(Pizza wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String description() {
        return wrappee.description();
    }

    @Override
    public float cost() {
        return wrappee.cost();
    }
}
