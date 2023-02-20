import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza  // Піца
        implements Valuable {

    public Pizza(Dough dough,
                 Additive... additivesList) {
        this.dough = dough;
        additives.addAll(Arrays.asList(additivesList));
    }

    private final Dough dough;  //  Тісто

    private final List<Additive> additives = new ArrayList<>();  // Добавки

    @Override
    public int getCost() {  // Вартість піци
        int totalCost = dough.getCost();
        for (Additive additive : additives) {
            totalCost += additive.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "\ndough = " + dough +
                ",\nadditives = " + additives +
                ",\ncost = " + getCost() + " Hrn" +
                "\n}";
    }
}
