public class ConcreteClass2 extends AbstractClass {

    public ConcreteClass2(int id) {
        this.id = id;
    }

    private final int id;

    @Override
    protected void step1() {
        System.out.println("ConcreteClass2: step1");
        throw new RuntimeException();
    }

    @Override
    protected boolean step2() {
        return id % 2 == 0; // ідентифікатор - парне число
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass2: step3");
    }

    @Override
    protected void step4() {
        System.out.println("ConcreteClass2: step4");
    }
}
