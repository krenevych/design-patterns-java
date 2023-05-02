public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitElementA(ElementA element) {
        element.featureA();

        System.out.println("ConcreteVisitor1 visits ElementA");
    }

    @Override
    public void visitElementB(ElementB element) {
        element.featureB();

        System.out.println("ConcreteVisitor1 visits ElementB");

    }
}
