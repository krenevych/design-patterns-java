import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    public Box(int id) {
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
        System.out.println("Box: " + id);
        for (Component child : children) {
            child.execute();
        }

    }
}
