public class Table extends Furniture {
    public Table(String matetial, String color, int nailNumber) {
        super(matetial, color, nailNumber);
    }

    @Override
    void use() {
        System.out.println("Table : use");
    }
}
