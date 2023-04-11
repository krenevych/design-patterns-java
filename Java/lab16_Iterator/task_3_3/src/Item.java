public class Item implements Component {

    private final String name;
    private final int value;


    public Item(String name, int value) {

        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void execute() {
        System.out.println(this);
    }
}
