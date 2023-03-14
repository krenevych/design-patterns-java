public class Main {

    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Pepper(pizza);
        pizza = new Cheese(pizza);
        pizza = new Pepper(pizza);


        System.out.println(pizza.cost());
        System.out.println(pizza.description());
    }
}
