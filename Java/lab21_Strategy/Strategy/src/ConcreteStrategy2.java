public class ConcreteStrategy2 implements Strategy {
    @Override
    public void execute(String data) {
        System.out.println("ConcreteStrategy2 doubles data in print!: ");
        System.out.println(data);
    }
}
