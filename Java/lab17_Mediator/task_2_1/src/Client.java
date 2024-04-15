public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Component[] components = {
                new Component("comp_0"),
                new Component("comp_1"),
                new Component("comp_2"),
                new Component("comp_3"),
                new Component("comp_4"),
                new Component("comp_5"),
        };

        for (Component component : components){
            mediator.add(component);
            component.setMediator(mediator);
        }

        components[3].sendMessage("Hello from 3", "comp_1");


    }

}
