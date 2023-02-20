public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza(
                new Dough(
                        Dough.DoughType.STANDARD,
                        Dough.Flour.CORNFLOUR,
                        40),
                new Additive(
                        Additive.AdditiveType.CHEESE,
                        "Радомер",
                        20),
                new Additive(
                        Additive.AdditiveType.SAUSAGES,
                        "мисливські",
                        30),
                new Additive(
                        Additive.AdditiveType.OLIVES,
                        "оливки",
                        15)
        );


        System.out.println(pizza);
    }
}
