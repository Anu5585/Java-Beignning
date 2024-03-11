public class Employee {
    private  String name;
    private PayStrategy PayStrategy;

    public Employee(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayStrategy getPayStrategy() {
        return PayStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        PayStrategy = payStrategy;
}
}