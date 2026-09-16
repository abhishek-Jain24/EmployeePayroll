public class FullTimeEmployee extends Employee {
    private double baseSalary;
    private double bonus;
    public FullTimeEmployee(String name, int id, double baseSalary , double bonus) {
        super(name,id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    @Override
    public double calSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void pay(){
        System.out.println(getName() + " " + "get" + " " + calSalary() + " " + "which is full time employee");
    }

}
