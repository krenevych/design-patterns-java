/**
 * Клас Покупець
 */
public class Customer {

  /**
   * Адреса доставки
   */
  private final String address;

  /**
   * Інтернет-магазин
   */
  private final ECommerceSite site;

  public Customer(String address) {
    this.address = address;
    site = new ECommerceSite(this);
  }

  /**
   * Повертає адресу доставлення
   * @return адресу доставлення
   */
  public String getAddress() {
    return address;
  }

  /**
   * Придбати товар
   *
   * @param item обраний товар для придбання
   * @param quantity кількість одиниць товару
   */
  public void buy(String item, int quantity) {
    if(site.checkInStock(item, quantity)) {
      site.sell(item, quantity);
    }
  }

}
