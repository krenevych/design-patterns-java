public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    void featureB() {
        System.out.println("ElementB: featureB");
    }
}
