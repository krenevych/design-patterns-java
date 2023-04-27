public class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute(String data) {
        System.out.println("Do something with data: " + data);
    }
}
