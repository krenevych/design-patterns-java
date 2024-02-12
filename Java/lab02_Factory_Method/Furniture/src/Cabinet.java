public class Cabinet extends Furniture {
    public Cabinet(String matetial, String color, int nailNumber) {
        super(matetial, color, nailNumber);
    }

    @Override
    void use() {
        System.out.println("Cabinet : use");
    }
}
