public class Dough    // Інгрідієнт Тісто
        implements Valuable {

    public static class Builder {
        public Builder setDoughType(DoughType doughType) {
            this.doughType = doughType;
            return this;
        }

        public Builder setFlour(Flour flour) {
            this.flour = flour;
            return this;
        }

        public Builder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Dough build(){
            return new Dough(doughType, flour, cost);
        }

        private DoughType doughType = DoughType.STANDARD;  // Тип тіста
        private Flour flour = Flour.CORNFLOUR;  // Борошно
        private int cost = 10;   // Вартість інгрідієнту
    }

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

    private Dough(DoughType doughType, Flour flour, int cost) {
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
