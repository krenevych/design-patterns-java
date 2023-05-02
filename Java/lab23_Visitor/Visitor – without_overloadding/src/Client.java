public class Client {

    public static void main(String[] args) {

        Visitor visitor1 = new ConcreteVisitor1();

        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        elementA.accept(visitor1);
        elementB.accept(visitor1);

        Visitor visitor2 = new ConcreteVisitor2();
        elementA.accept(visitor2);

    }

}
