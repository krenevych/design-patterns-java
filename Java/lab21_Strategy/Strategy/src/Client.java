public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setData("Hello, World!");

        context.setStrategy(new ConcreteStrategy1());
        context.doSomething();

        context.setStrategy(new ConcreteStrategy2());
        context.doSomething();

        context.setStrategy(new Strategy() {
            @Override
            public void execute(String data) {
                System.out.println("Anonymous class to create strategy");
                System.out.println("working with data " + data);
            }
        });
        context.doSomething();

        context.setStrategy(data -> {
            System.out.println("Using lambda to create strategy");
            System.out.println("working with data " + data);
        });
        context.doSomething();
    }

}
