public class Topping  // Добавки (начинка) - сир, оливки, ковбаски, тощо
        implements Valuable {

    public static class Builder {
        public Builder setToppingType(ToppingType toppingType) {
            this.toppingType = toppingType;
            return this;
        }

        public Builder setToppingName(String toppingName) {
            this.toppingName = toppingName;
            return this;
        }

        public Builder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Topping build(){
            return new Topping(toppingType, toppingName, cost);
        }

        private ToppingType toppingType = Topping.ToppingType.CHEESE;  // Тип добавки
        private String toppingName = "Радомер";    // Назва добавки
        private int cost = 20;               // Вартість добавки
    }

    enum ToppingType {   // Тип добавки
        CHEESE,   // сир
        OLIVES,   // оливки
        SAUSAGES  // ковбаски
    }

    private final ToppingType toppingType;  // Тип добавки
    private final String toppingName;    // Назва добавки
    private final int cost;               // Вартість добавки

    private Topping(ToppingType toppingType,
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
