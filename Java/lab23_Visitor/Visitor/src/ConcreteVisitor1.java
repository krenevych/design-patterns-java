public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visit(ElementA element) {
        element.featureA();

        System.out.println("ConcreteVisitor1 visits ElementA");
    }

    @Override
    public void visit(ElementB element) {
        element.featureB();

        System.out.println("ConcreteVisitor1 visits ElementB");

    }
}
