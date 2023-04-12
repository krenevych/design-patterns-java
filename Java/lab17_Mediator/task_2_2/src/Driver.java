public class Driver {

  /**
   * Доставлення товару покупцю
   * @param item товар
   * @param quantity кількість товару
   * @param customer покупець
   */
  public void deliver(String item, int quantity, Customer customer) {
    System.out.println(quantity + " " + item + " out for delivery to " + customer.getAddress());
  }

}
