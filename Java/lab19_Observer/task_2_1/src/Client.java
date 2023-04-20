public class Client {

    public static void main(String[] args) {

        Publisher publisher = new Publisher("Publisher1");

        Subscriber[] subscribers = {
                new ConcreteSubscriber("Subscriber 0"),
                new ConcreteSubscriber("Subscriber 1"),
                new ConcreteSubscriber("Subscriber 2"),
                new ConcreteSubscriber("Subscriber 3"),
                new ConcreteSubscriber("Subscriber 5"),
        };

        for (Subscriber subscriber : subscribers) {
            publisher.subscribe(subscriber);
        }


        System.out.println("========= State 1 ===========");
        publisher.setMainState("State 1");

        publisher.unsubscribe(subscribers[0]);
        publisher.unsubscribe(subscribers[3]);

        Publisher publisher2 = new Publisher("Publisher2");
        publisher2.subscribe(subscribers[0]);
        publisher2.subscribe(subscribers[3]);
        publisher2.subscribe(subscribers[1]);

        System.out.println("========= State 2 ===========");
        publisher.setMainState("State 2");
        publisher2.setMainState("State 2");



    }

}
