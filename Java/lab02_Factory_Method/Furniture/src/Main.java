public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
//        FurnitureMaster chairMaster = Chair::new;
        FurnitureMaster tableMaster = new TableMaster();
        FurnitureMaster cabinetMaster = Cabinet::new;
//
//        shop.buildFurniture(chairMaster);
//        shop.buildFurniture(chairMaster);

        shop.buildFurniture(tableMaster);
        shop.buildFurniture(tableMaster);
        shop.buildFurniture(tableMaster);

//        shop.buildFurniture(cabinetMaster);

        shop.useFurnitures();

    }
}