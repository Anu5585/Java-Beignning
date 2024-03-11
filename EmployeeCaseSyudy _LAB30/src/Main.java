public class Main {
    public static void main(String[] args) {
        Employee ali = new Employee("Ali");
        HourlyStrategy aliHourlyStrategy = new HourlyStrategy(10,2000);
        SalariedStrategy alisalariedStrategy = new SalariedStrategy(5500);
        ali.setPayStrategy(aliHourlyStrategy);
        System.out.println(ali.getPayStrategy().calculatePay());
        ali.setPayStrategy(alisalariedStrategy);
        System.out.println(ali.getPayStrategy().calculatePay());

}
}