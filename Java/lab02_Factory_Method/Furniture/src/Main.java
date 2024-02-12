public class Main {
    public static void main(String[] args) {
//        String material = "Wood";
//        String color = "Crimson";
//        int nailNumber = 100;

//        Table  table = new Table(material, color, nailNumber);
//        Table  table2 = new Table(material, color, nailNumber);
//        Chair chair = new Chair(material, color, nailNumber);
        Shop shop = new ShopChair();
        shop.buildFurniture();
        shop.buildFurniture();

//        shop.addFurniture(table);
//        shop.addFurniture(table2);
//        shop.addFurniture(chair);
//        shop.buildFurniture(Furniture.Type.CHAIR);
//        shop.buildFurniture(Furniture.Type.TABLE);
//        shop.buildFurniture(Furniture.Type.TABLE);
//        shop.buildFurniture(Furniture.Type.CABINET);

        shop.useFurnitures();

    }
}