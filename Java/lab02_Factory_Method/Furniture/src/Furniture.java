abstract class Furniture {
    private final String matetial;
    private final String color;
    private final int nailNumber;

    public Furniture(String matetial, String color, int nailNumber) {
        this.matetial = matetial;
        this.color = color;
        this.nailNumber = nailNumber;
    }

    abstract void use();

    public enum Type {
        TABLE,
        CHAIR,
        CABINET,
    }
}
