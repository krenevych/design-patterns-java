public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    void featureA(){
        System.out.println("ElementA: featureA");
    }
}
