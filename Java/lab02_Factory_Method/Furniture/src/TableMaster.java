public class TableMaster implements FurnitureMaster {
    private Furniture furniture;

    @Override
    public Furniture createFurniture(String matetial, String color, int nailNumber) {
        if (furniture == null){
            furniture = new Table(matetial, color, nailNumber);
        }
        return furniture;
    }
}
