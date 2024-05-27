public abstract class Employee {
    private String name;

    static int count;

    private int id;

    abstract double earnings();

    public Employee(String name) {
        this.name = name;
        this.id = ++Employee.count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + "id="+ id  +
                '}';
    }
}
