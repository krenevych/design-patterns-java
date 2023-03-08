public class ExpensesClient {

  public static void main(String[] args) {
    Manager jane = new Manager("Jane", 100);
    Salesperson bob = new Salesperson("Bob", 300, jane);
    Salesperson sue = new Salesperson("Sue", 200, jane);

    SalesTeam team = new SalesTeam();
    team.addManager(jane);
    team.addSalesperson(bob);
    team.addSalesperson(sue);

    payManager(jane);
    paySalesperson(bob);
    payTeam(team);
  }

  private static void payManager(Manager manager) {
    System.out.println("Expenses have been requested");
    manager.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

  private static void paySalesperson(Salesperson salesperson) {
    System.out.println("Expenses have been requested");
    salesperson.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

  private static void payTeam(SalesTeam team) {
    System.out.println("Expenses have been requested");
    team.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

}
