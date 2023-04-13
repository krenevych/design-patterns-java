/**
 * Клас Покупець
 */
public class Customer extends Component {

  /**
   * Адреса доставки
   */
  private final String address;

  public Customer(String address) {
    this.address = address;
  }

  /**
   * Придбати товар
   *
   * @param item товар
   * @param quantity кількість
   */
  public void buy(String item, int quantity) {
    Order order = new Order(item, quantity, address, "Hello :) ");
    broadcastMessage(order);
  }

  @Override
  public void handleMessage(Component componentFrom, Order order) {
    if (componentFrom instanceof Driver){
      System.out.printf("Customer: Item %s is delivered \n", order.item);
    } else if (componentFrom instanceof ECommerceSite && order.message.startsWith("Fail")){
      System.out.println("Customer: " + order.message);
    }
  }

}
