public class Salesperson {

  private final String name;
  private final int salary;

  private final Manager manager;

  public Salesperson(String name, int salary, Manager manager) {
    this.name = name;
    this.salary = salary;
    this.manager = manager;
  }

  public void payExpenses() {
    System.out.println(name + " has been paid $" + salary);
  }

}
