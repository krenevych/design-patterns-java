import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza  // Піца
        implements Valuable {

    public Pizza(Dough dough,
                 Topping... additivesList) {
        this.dough = dough;
        toppings.addAll(Arrays.asList(additivesList));
    }

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
        return "Pizza{" +
                "\ndough = " + dough +
                ",\nadditives = " + toppings +
                ",\ncost = " + getCost() + " Hrn" +
                "\n}";
    }
}
