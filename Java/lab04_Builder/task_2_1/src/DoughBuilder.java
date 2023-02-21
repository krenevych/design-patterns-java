    public class DoughBuilder {
        private Dough.DoughType doughType = Dough.DoughType.STANDARD;  // Тип тіста
        private Dough.Flour flour = Dough.Flour.WHEAT;  // Борошно
        private int cost = 20;   // Вартість інгрідієнту

        public DoughBuilder setDoughType(Dough.DoughType doughType) {
            this.doughType = doughType;
            return this;
        }

        public DoughBuilder setFlour(Dough.Flour flour) {
            this.flour = flour;
            return this;
        }

        public DoughBuilder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Dough build() {
            return new Dough(doughType, flour, cost);
        }
    }