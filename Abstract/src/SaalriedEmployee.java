public class SaalriedEmployee extends Employee implements Payable,Runnable{
    private double weeklySaalry;

    public SaalriedEmployee(String name, double weeklySaalry) {
        super(name);
        this.weeklySaalry = weeklySaalry;
    }

    @Override
    public double earning() {
        return 0;
    }

    @Override
    public void foo() {

    }

    @Override
    public void run() {

    }
}
