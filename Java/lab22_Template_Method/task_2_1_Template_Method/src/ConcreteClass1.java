public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void step3() {
        System.out.println("ConcreteClass1: step3");
    }

    @Override
    protected void step4() {
        System.out.println("ConcreteClass1: step4");
    }

    @Override
    protected void hook1() {
        System.out.println("ConcreteClass1: hook1");
    }
}
