public interface PriceVisitor {
    void visit(Bread bread);
    void visit(Milk milk);

    void visit(Coffee coffee);
}
