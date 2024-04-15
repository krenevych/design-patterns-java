public class ConcreteStrategy implements Strategy {

    final int count;

    public ConcreteStrategy(int count) {
        this.count = count;
    }

    @Override
    public void execute(String data) {
        for (int i = 0; i < count; i++){
            System.out.println(data);
        }
    }
}
