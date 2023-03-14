public class Cheese extends Topping {
    public Cheese(Pizza wrappee) {
        super(wrappee);
    }

    @Override
    public String description() {
        return super.description() + " Cheese ";
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f;
    }
}
