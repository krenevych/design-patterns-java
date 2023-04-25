public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteState1());

        context.doThis();
        context.doThat();
        context.doThat();
        context.doThis();

    }

}
