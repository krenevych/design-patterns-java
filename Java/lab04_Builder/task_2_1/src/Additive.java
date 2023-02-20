public class Additive  // Добавки - сир, оливки, ковбаски, тощо
        implements Valuable {

    enum AdditiveType {   // Тип добавки
        CHEESE,   // сир
        OLIVES,   // оливки
        SAUSAGES  // ковбаски
    }

    private final AdditiveType additive;  // Тип добавки
    private final String additiveName;    // Назва добавки
    private final int cost;               // Вартість добавки

    public Additive(AdditiveType additiveType,
                    String additiveName,
                    int cost) {
        this.additive = additiveType;
        this.additiveName = additiveName;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Additive{" +
                "additive=" + additive +
                ", additiveName='" + additiveName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
