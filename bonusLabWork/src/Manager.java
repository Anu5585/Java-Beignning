import java.util.Date;

public class Manager extends Employee{
   private double bonus;

    public Manager(String name, double salary, Date hireDate) {
        super(name, salary, hireDate);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
