public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(String name, double comissionRate, int grossSales, double baseSalary) {
        super(name, comissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double earnings() {
        return baseSalary + (getGrossSales() * getComissionRate());
    }

    @Override
    public String toString() {
        return "BasePlusComissionEmployee{" +
                " id= " + getId() +
                " name= " + getName() +
                " baseSalary= " + baseSalary +
                '}';
    }
}
