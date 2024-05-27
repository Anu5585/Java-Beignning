public class ComissionEmployee extends Employee{
    private double comissionRate;
    private int grossSales;

    public ComissionEmployee(String name, double comissionRate, int grossSales) {
        super(name);
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    double earnings() {
        return comissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" +
                " id " + getId() +
                " name= " + getName() +
                " comissionRate= " + comissionRate +
                " grossSales= " + grossSales +
                '}';
    }
}
