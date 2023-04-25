public class ConcreteState1 implements State {
    @Override
    public void doThis(Context context) {
        System.out.println("ConcreteState1" + " doThis() ");
        context.changeState(new ConcreteState2());
                System.out.println("New state: ConcreteState2");
    }

    @Override
    public void doThat(Context context) {
        System.out.println("ConcreteState1" + " doThat() ");
        System.out.println("Do nothing!");

    }
}
