public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        Employee e1 = new FullTimeEmployee("Aakash", 1, 50000, 5000);
        Employee e2 = new PartTimeEmployee("Rajat", 2, 80, 200);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);

        System.out.println("\n--- Payslips ---");
        payroll.generatePayslip(e1);
        payroll.generatePayslip(e2);

        System.out.println("\n--- Paying All Employees ---");
        payroll.payAll();

        System.out.println("\n--- Remove Employee ID 2 ---");
        payroll.removeEmployee(2);

        System.out.println("\n--- Remove Employee ID 99 ---");
        payroll.removeEmployee(99);

        System.out.println("\n--- Remaining Employees ---");
        System.out.println("Count: " + payroll.getEmployees().size());

    }
}