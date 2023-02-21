public class Topping  // Добавки (начинка) - сир, оливки, ковбаски, тощо
        implements Valuable {

    enum ToppingType {   // Тип добавки
        CHEESE,   // сир
        OLIVES,   // оливки
        SAUSAGES  // ковбаски
    }

    private final ToppingType toppingType;  // Тип добавки
    private final String toppingName;    // Назва добавки
    private final int cost;               // Вартість добавки

    public Topping(ToppingType toppingType,
                   String toppingName,
                   int cost) {
        this.toppingType = toppingType;
        this.toppingName = toppingName;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "toppingType=" + toppingType +
                ", toppingName='" + toppingName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
