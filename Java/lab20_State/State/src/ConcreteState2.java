public class ConcreteState2 implements State {
    @Override
    public void doThis(Context context) {
        System.out.println("ConcreteState2" + " doThis() ");
        System.out.println("Do nothing!");
    }

    @Override
    public void doThat(Context context) {
        System.out.println("ConcreteState2" + " doThat() ");
        System.out.println("New state: ConcreteState1");
        context.changeState(new ConcreteState1());
    }
}
