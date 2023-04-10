public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");

    StaffList staffList = new StaffList();
    staffList.addEmployee(zak);
    staffList.addEmployee(sarah);
    staffList.addEmployee(anna);

          // TODO: Implement pattern to run commented code
//    for (Employee employee : StaffList){
//      System.out.println(employee);
//    }

  }

}
