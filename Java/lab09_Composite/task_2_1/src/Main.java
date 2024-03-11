public class Main {
    public static void main(String[] args) {

        Composite root = new Composite("root");
        Component leaf11 = new Leaf("11");
        Component leaf12 = new Leaf("12");
        Component leaf13 = new Leaf("13");

        Composite composite2 = new Composite("2");
        root.add(leaf11);
        root.add(composite2);
        root.add(leaf12);
        root.add(leaf13);

        Component leaf21 = new Leaf("21");
        Component leaf22 = new Leaf("22");

        composite2.add(leaf22);
        composite2.add(leaf21);


        ///////////////////////////////////////////
        ///////////////////////////////////////////
        root.execute();

        leaf13.execute();



    }
}
