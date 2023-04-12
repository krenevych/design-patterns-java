import java.util.HashMap;

public class ECommerceSite {

  /**
   * Покупець
   */
  private Customer customer;
  /**
   * Служба доставлення
   */
  private Driver driver;

  /**
   * Товари, що наявні в магазині
   */
  private final HashMap<String, Integer> stock;


  public ECommerceSite(Customer customer) {
    this.customer = customer;
    this.driver = new Driver();
    stock = new HashMap();
    stock.put("pens", 100);
    stock.put("pencils", 50);
    stock.put("erasers", 75);
  }

  /**
   * Замовлення товару
   * @param item товар
   * @param quantity кількість одиниць товару
   * @return true, якщо замовлення товару пройшло успішно
   */
  public boolean checkInStock(String item, int quantity) {
    if (stock.containsKey(item) && stock.get(item) > quantity) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Відвантажити замовлення
   * @param item товар
   * @param quantity кількість одиниць товару
   */
  public void sell(String item, int quantity) {

    int newQuantity = stock.get(item) - quantity;
    stock.put(item, newQuantity);

    driver.deliver(item, quantity, customer);
  }



}
