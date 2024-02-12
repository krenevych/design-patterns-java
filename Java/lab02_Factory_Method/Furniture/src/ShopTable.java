public class ShopTable extends Shop {
    @Override
    Furniture createFurniture() {
        return new Table(material, color, nailNumber);
    }
}
