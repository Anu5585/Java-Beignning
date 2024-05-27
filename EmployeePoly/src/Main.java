import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> emps = new ArrayList<>();
        emps.add(new SalariedEmployee("Usama", 150.5));
        emps.add(new HourlyEmployee("Ashar", 250, 25));
        emps.add(new ComissionEmployee("Rafay", 10.3, 25));
        emps.add(new BasePlusComissionEmployee("Mohib", 12.5, 10, 250));


        for (Employee e : emps) {
            System.out.print(e.getId());
            System.out.println(e.getName());

        }

    }
}