public class PizzaYolla {



    Pizza createTexas(){
        Topping.Builder toppingBuilder = new Topping.Builder();

        Topping toppingCheese = toppingBuilder.build();
        Topping toppingSausages = toppingBuilder
                .setToppingName("мисливські")
                .setToppingType(Topping.ToppingType.SAUSAGES)
                .setCost(30).build();

        Topping toppingOlives = toppingBuilder
                .setToppingName("оливки")
                .setToppingType(Topping.ToppingType.OLIVES)
                .setCost(15).build();


        Dough dough = (new Dough.Builder())
                .setDoughType(Dough.DoughType.THIN)
                .setFlour(Dough.Flour.RICE)
                .build();


        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();

        Pizza pizza = pizzaBuilder
                .setName("Texas")
                .addTopping(toppingCheese)
                .addTopping(toppingSausages)
                .addTopping(toppingOlives)
                .setDough(dough)
                .bake();

        return pizza;
    }

    Pizza createMilano(){
        Topping.Builder toppingBuilder = new Topping.Builder();

        Topping toppingCheese = toppingBuilder
                .setToppingType(Topping.ToppingType.CHEESE)
                .setToppingName("Mazdamer")
                .build();

        Topping toppingSausages = toppingBuilder
                .setToppingName("мисливські")
                .setToppingType(Topping.ToppingType.SAUSAGES)
                .setCost(30).build();

        Topping toppingOlives = toppingBuilder
                .setToppingName("оливки")
                .setToppingType(Topping.ToppingType.OLIVES)
                .setCost(15).build();


        Dough dough = (new Dough.Builder())
                .setDoughType(Dough.DoughType.THICK)
                .setFlour(Dough.Flour.WHEAT)
                .setCost(100)
                .build();


        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();

        Pizza pizza = pizzaBuilder
                .setName("Milano")
                .addTopping(toppingCheese)
                .addTopping(toppingSausages)
                .addTopping(toppingCheese)
                .addTopping(toppingSausages)
                .addTopping(toppingOlives)
                .addTopping(toppingOlives)
                .addTopping(toppingOlives)
                .addTopping(toppingSausages)
                .addTopping(toppingOlives)
                .setDough(dough)
                .bake();

        return pizza;
    }

}
