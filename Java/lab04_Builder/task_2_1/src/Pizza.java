import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza  // Піца
        implements Valuable {

    public static class PizzaBuilder {
        private String name = "'Домашня проба'";
        private Dough dough = (new Dough.Builder()).build();
        private final List<Topping> toppings = new ArrayList<>();  // Добавки

        public PizzaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PizzaBuilder setDough(Dough dough) {
            this.dough = dough;
            return this;
        }
        public PizzaBuilder addTopping(Topping topping){
            toppings.add(topping);
            return this;
        }

        public Pizza bake(){
            return new Pizza(
                    name,
                    dough,
                    toppings
            );
        }


    }

    private Pizza(String name,
                 Dough dough,
                 Topping... additivesList) {
        this(name, dough, Arrays.asList(additivesList));
    }


    private Pizza(String name,
                 Dough dough,
                 List<Topping> additivesList) {
        this.name = name;
        this.dough = dough;
        toppings.addAll(additivesList);
    }

    private final String name;
    private final Dough dough;  //  Тісто

    private final List<Topping> toppings = new ArrayList<>();  // Добавки

    @Override
    public int getCost() {  // Вартість піци
        int totalCost = dough.getCost();
        for (Topping topping : toppings) {
            totalCost += topping.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza " + name +
              " {" +
                "\ndough = " + dough +
                ",\ntoppings = " + toppings +
                ",\ncost = " + getCost() + " Hrn" +
                "\n}";
    }
}
