public class Main {

  public static void main(String[] args) {
    ShopMediator mediator = new ShopMediator();

    Customer customer = new Customer("123 Sunny Street");
    ECommerceSite site = new ECommerceSite();
    Driver driver = new Driver();

    customer.setMediator(mediator);
    site.setMediator(mediator);
    driver.setMediator(mediator);

    mediator.addComponent(customer);
    mediator.addComponent(site);
    mediator.addComponent(driver);

    customer.buy("pens", 3);
  }

}
