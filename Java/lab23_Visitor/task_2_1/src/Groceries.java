public interface Groceries {

    double getPrice();
    void accept(PriceVisitor visitor);

}
