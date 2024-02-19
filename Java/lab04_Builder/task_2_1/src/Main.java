public class Main {
    public static void main(String[] args) {

        PizzaYolla pizzaYolla = new PizzaYolla();

        Pizza texas = pizzaYolla.createTexas();
        Pizza milano = pizzaYolla.createMilano();

        System.out.println(texas);
        System.out.println(milano);
    }
}
