public class HourlyStrategy extends PayStrategy{

    private double hours;

    private double wage;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public HourlyStrategy(double hours, double wage) {
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    double calculatePay() {
        return hours*wage;
}
}