import java.util.HashMap;

public class Mediator {
    private final HashMap<String, Component> components = new HashMap<>();

    public void add(Component component){
        components.put(component.id, component);
    }

    public void receiveMessage(String message,
                               String componentFrom,
                               String componentTo){
        Component component = components.get(componentTo);
        if (component != null){
            component.receiveMessage(message, componentFrom);
        }
    }

}
