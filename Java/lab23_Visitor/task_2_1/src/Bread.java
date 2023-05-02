public class Bread implements Groceries {

    private double price = 1;

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
