public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setData("Hello!");


        context.setStrategy(new Strategy() {  // застосування стратегії через анонімний клас
            @Override
            public void execute(String data) {
                System.out.println("Data = " + data);
            }
        });
        context.doSomething();
        /////////////////// застосування стратегії через лямбда вираз
        context.setStrategy(data -> System.out.println("Length = " + data.length()));
        context.doSomething();
        /////////////////// застосування стратегії через нащадок класу Strategy.
        System.out.println("//////////////////");
        Strategy strategy = new ConcreteStrategy(10);
        context.setStrategy(strategy);
        context.doSomething();
    }

}
