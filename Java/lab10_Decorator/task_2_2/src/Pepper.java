public class Pepper extends Topping {
    public Pepper(Pizza wrappee) {
        super(wrappee);
    }

    @Override
    public String description() {
        return super.description() + " Pepper ";
    }

    @Override
    public float cost() {
        return super.cost() + 2.f;
    }
}
