public class ConcreteSubscriber implements Subscriber {

    private final String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Publisher publisher, String context) {
        System.out.printf("Subscriber %s receives %s from %s\n", name, context, publisher.getName());
    }
}
