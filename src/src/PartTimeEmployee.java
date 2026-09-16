public class PartTimeEmployee extends Employee {
    private int hours;
    private double ratePerHour;

    public PartTimeEmployee(String name,int id, int hours, double ratePerHour) {
        super(name, id);
        this.hours = hours;
        this.ratePerHour = ratePerHour;

    }

    @Override
    public double calSalary() {
        return hours * ratePerHour;
    }

    @Override
    public void pay(){
        System.out.println(getName()+ " " + " get " +" " + calSalary() + " " + "which is part time employee");
    }
}
