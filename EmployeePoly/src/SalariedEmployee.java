public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{ " +
                " id " + getId() +
                " name= " + getName() +
                " weeklySalary= " + weeklySalary +
                " earnings= " + earnings() +
                '}';
    }
}
