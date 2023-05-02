public class InflationPriceVisitor implements PriceVisitor {
    @Override
    public void visit(Bread bread) {
        double breadPrice = bread.getPrice();
        // збільшує ціну в півтора рази
        breadPrice *= 1.5;
        bread.setPrice(breadPrice);
    }

    @Override
    public void visit(Milk milk) {
        double milkPrice = milk.getPrice();
        // додає до вартості 0.5грн
        milkPrice += 1.5;
        milk.setPrice(milkPrice);
    }

    @Override
    public void visit(Coffee coffee) {
        double coffeePrice = coffee.getPrice();
        // додаємо до вартості акциз  20%
        coffeePrice *= 1.2;
        coffee.setPrice(coffeePrice);
    }
}
