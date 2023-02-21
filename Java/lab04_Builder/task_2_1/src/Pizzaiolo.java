public class Pizzaiolo { // Директор


    public Pizza getHawaiPizza() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        DoughBuilder doughBuilder = new DoughBuilder();
        ToppingBuilder toppingBuilder = new ToppingBuilder();

        Dough dough = doughBuilder
                .setDoughType(Dough.DoughType.STANDARD)
                .setFlour(Dough.Flour.CORNFLOUR)
                .setCost(30)
                .build();

        Topping radamer = toppingBuilder
                .setToppingType(Topping.ToppingType.CHEESE)
                .setToppingName("радамер")
                .setCost(30)
                .build();

        return pizzaBuilder
                .setName("Hawai")
                .setDough(dough)
                .addTopping(radamer)
                .build();
    }

    public Pizza getTexasPizza() {
        return null; // TODO:
    }

    public Pizza getCountryPizza() {
        return null;  // TODO:
    }


}
