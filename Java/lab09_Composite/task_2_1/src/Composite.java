import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final String nodeName;
    private final List<Component> children = new ArrayList<>();

    public Composite(String nodeName) {
        this.nodeName = nodeName;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren(){
//        return children; # щоб уникнути несанкціонованого додавання та видалення дітей будемо повертати копію
        return new ArrayList<>(children);
    }

    @Override
    public void execute() {
        System.out.println("Node: " + nodeName);
        for (Component child : children) {
            child.execute();
        }

    }
}
