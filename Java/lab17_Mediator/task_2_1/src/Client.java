public class Client {

    public static void main(String[] args) {

        ConcreteComponent[] components = {
                new ConcreteComponent("Comp1"),
                new ConcreteComponent("Comp2"),
                new ConcreteComponent("Comp3"),
                new ConcreteComponent("Comp4"),
        };

        ConcreteMediator mediator = new ConcreteMediator();

        for (ConcreteComponent component : components) {
            component.setMediator(mediator);
            mediator.addComponent(component);
        }

        Component component3 = components[2];

        component3.broadcastMessage("Hello!");

    }

}
