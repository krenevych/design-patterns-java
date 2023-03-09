public class Leaf implements Component {

    private final int id;

    public Leaf(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Leaf: " + id);
    }
}
