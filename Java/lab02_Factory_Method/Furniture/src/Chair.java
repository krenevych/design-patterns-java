public class Chair extends Furniture {
    public Chair(String matetial, String color, int nailNumber) {
        super(matetial, color, nailNumber);
    }

    @Override
    void use() {
        System.out.println("Chair : use");
    }
}
