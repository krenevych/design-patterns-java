public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza(
                "'Домашня проба'",
                new Dough(
                        Dough.DoughType.STANDARD,
                        Dough.Flour.CORNFLOUR,
                        40),
                new Topping(
                        Topping.ToppingType.CHEESE,
                        "Радомер",
                        20),
                new Topping(
                        Topping.ToppingType.SAUSAGES,
                        "мисливські",
                        30),
                new Topping(
                        Topping.ToppingType.OLIVES,
                        "оливки",
                        15)
        );


        System.out.println(pizza);
    }
}
