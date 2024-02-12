public class ShopChair extends Shop {
    @Override
    protected Furniture createFurniture() {
        return new Chair(material, color, nailNumber);
    }
}
