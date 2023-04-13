public class Driver extends Component {

  /**
   * Доставлення товару покупцю
   *
   * @param order замовлення
   */
  public void deliver(Order order) {
    System.out.printf("Driver: %d %s out for delivery to %s\n", order.quantity, order.item, order.address);
    broadcastMessage(order);
  }

  @Override
  public void handleMessage(Component componentFrom, Order order) {
    if (componentFrom instanceof ECommerceSite) {
      if (!order.message.startsWith("Fail")) {  // Якщо магазин зміг відвантажити товар
        deliver(order);
      }
    }
  }
}
