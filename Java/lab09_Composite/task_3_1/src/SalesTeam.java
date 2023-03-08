import java.util.ArrayList;
import java.util.List;

public class SalesTeam {

    private final List<Manager> managers = new ArrayList<>();
    private final List<Salesperson> salespeople = new ArrayList<>();

    void addManager(Manager manager) {
        managers.add(manager);
    }

    void addSalesperson(Salesperson salesperson) {
        salespeople.add(salesperson);
    }

    public void payExpenses() {
        for (Manager manager : managers) {
            manager.payExpenses();
        }

        for (Salesperson salesperson : salespeople) {
            salesperson.payExpenses();
        }
    }

}
