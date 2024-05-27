public class HourlyEmployee extends Employee{
    private int hours;
    private double wage;

    public HourlyEmployee(String name, int hours, double wage) {
        super(name);
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    double earnings() {
        return hours * wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                " id= " + getId() +
                " name= " + getName() +
                " hours= " + hours +
                " wage= " + wage +
                '}';
    }
}
