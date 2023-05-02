public class Coffee implements Groceries {

    private double price = 10;

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void accept(PriceVisitor visitor) {
        visitor.visit(this);
    }

}
