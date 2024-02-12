public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        FurnitureMaster chairMaster = Chair::new;
        FurnitureMaster tableMaster = new TableMaster();

        shop.setFurnitureMaster(chairMaster);

        shop.buildFurniture();
        shop.buildFurniture();

        shop.setFurnitureMaster(tableMaster);
        shop.buildFurniture();
        shop.buildFurniture();
        shop.buildFurniture();


        shop.useFurnitures();

    }
}