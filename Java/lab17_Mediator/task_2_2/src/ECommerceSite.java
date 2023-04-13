import java.util.HashMap;

public class ECommerceSite extends Component {

  /**
   * Товари, що наявні в магазині
   */
  private final HashMap<String, Integer> stock;

  public ECommerceSite() {
    stock = new HashMap<>();
    stock.put("pens", 100);
    stock.put("pencils", 50);
    stock.put("erasers", 75);
  }

  /**
   * Замовлення товару
   *
   * @param order товар
   * @return true, якщо замовлення товару пройшло успішно
   */
  public boolean checkInStock(Order order) {
    String itemInStock = order.item;
    boolean res = stock.containsKey(itemInStock) && stock.get(itemInStock) > order.quantity;
    if (res) {
      int newQuantity = stock.get(itemInStock) - order.quantity;
      stock.put(itemInStock, newQuantity);
    }

    return res;
  }

  /**
   * Відвантажити замовлення
   *
   * @param order замовлення
   */
  public void sell(Order order) {
    if (checkInStock(order)) {
      broadcastMessage(order); // пересилаємо повідомлення далі, для отримання його службою доставлення
    } else {
      // пересилаємо повідомлення далі, з повідомленням, що не можливо відвантажити товар
      broadcastMessage(new Order(order, "Fail: There is not enough quantity to ship Item"));
    }
  }


  @Override
  public void handleMessage(Component componentFrom, Order order) {
    if (componentFrom instanceof Customer) { // Якщо повідомлення прийшло від клієнта
      sell(order);
    }
  }
}
