public class Dough    // Інгрідієнт Тісто
        implements Valuable {

    enum DoughType {  // Тип тіста
        STANDARD,  // Стандартне
        THIN,      // Тонке
        THICK,     // Пухке
    }

    enum Flour {  // Тип борошна
        WHEAT,      // пшеничне борошно
        CORNFLOUR,  // кукурудзяне борошно
        RYE,        // Житнє борошно
        RICE,       // Рисове борошно
    }

    private final DoughType doughType;  // Тип тіста
    private final Flour flour;  // Борошно
    private final int cost;   // Вартість інгрідієнту

    public Dough(DoughType doughType, Flour flour, int cost) {
        this.doughType = doughType;
        this.flour = flour;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "doughType=" + doughType +
                ", flour=" + flour +
                ", cost=" + cost +
                '}';
    }
}
