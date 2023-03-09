import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    public Composite(int id) {
        this.id = id;
    }

    private final int id;

    private final List<Component> children
            = new ArrayList<>();

    public void add(Component child){
        children.add(child);
    }

    public void remove(Component child){
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }


    @Override
    public void execute() {
        System.out.println("Composite: " + id);
        for (Component child : children) {
            child.execute();
        }

    }
}
