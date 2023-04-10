public class ShopItem {

  private final String name;
  private final int quantity;

  public ShopItem(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Item{" +
            "name='" + name + '\'' +
            ", quantity=" + quantity +
            '}';
  }
}
