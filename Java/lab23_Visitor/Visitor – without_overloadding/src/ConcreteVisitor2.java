public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitElementA(ElementA element) {
        element.featureA();

        System.out.println("ConcreteVisitor2 visits ElementA");
    }

    @Override
    public void visitElementB(ElementB element) {
        element.featureB();

        System.out.println("ConcreteVisitor2 visits ElementB");

    }
}
