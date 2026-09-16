import java.util.ArrayList;
import java.util.List;

public class Payroll {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee " + e.getName() + " has been added to the Payroll");
    }
    public void removeEmployee(int id) {
        Employee empToRemove = null;

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                empToRemove = employee;
                break;
            }
        }

        if (empToRemove != null) {
            employees.remove(empToRemove);
            System.out.println("Employee " + empToRemove.getName() + " removed");
        } else {
            System.out.println(" Employee with ID " + id + " not found");
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void generatePayslip(Employee e) {
        System.out.println(e);
        System.out.println("Total Salary: ₹" + e.calSalary());
        System.out.println("---------------------------------------");
    }

    public void payAll() {
        for (Employee employee : employees) {
            employee.pay();
        }
    }
}