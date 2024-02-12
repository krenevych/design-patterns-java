public class TableMaster implements FurnitureMaster {
    @Override
    public Furniture createFurniture(String matetial, String color, int nailNumber) {
        return new Table(matetial, color, nailNumber);
    }
}
