public class DiscountVisitor implements PriceVisitor {
    @Override
    public void visit(Bread bread) {
        double breadPrice = bread.getPrice();
        // робить знижку 10%
        breadPrice *= 0.9;
        bread.setPrice(breadPrice);
    }

    @Override
    public void visit(Milk milk) {
        double milkPrice = milk.getPrice();
        // робимо знижку 20%
        milkPrice *= 0.8;
        milk.setPrice(milkPrice);
    }

    @Override
    public void visit(Coffee coffee) {
        double coffeePrice = coffee.getPrice();
        // робимо знижку 1%
        coffeePrice *= 0.99;
        coffee.setPrice(coffeePrice);
    }
}
