public class SalariedStrategy extends  PayStrategy{
    private double weekly;

    public double getWeekly() {
        return weekly;
    }

    public void setWeekly(double weekly) {
        this.weekly = weekly;
    }

    public SalariedStrategy(double weekly) {
        this.weekly = weekly;
    }

    @Override
    double calculatePay() {
        return weekly;
}
}