import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {


    private String name = "Default";  // Ім'я піци за промовчанням

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    private Dough dough;
//    = new Dough(   // Тісто за промовчанням
//            Dough.DoughType.STANDARD,
//            Dough.Flour.WHEAT,
//            20);  //  Тісто

    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    private final List<Topping> toppings = new ArrayList<>();  // Добавки

    public PizzaBuilder addTopping(Topping topping){
        toppings.add(topping);
        return this;
    }

    Pizza build(){
        return new Pizza(name, dough, toppings);
    }

}
