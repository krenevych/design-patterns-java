import java.util.ArrayList;
import java.util.List;

public class ShopMediator implements Mediator {

    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void broadcast(Component componentFrom, Order order) {
        for (Component component : components) {
            component.handleMessage(componentFrom, order);
        }
    }


}
