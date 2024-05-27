package genericList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        persons.add(new Person("Zubair"));
        persons.add(new Person("Umair"));
        persons.add(new Person("Ahmed"));
        outputList(persons);
        System.out.println(persons);
        List<Employee> emps = new ArrayList();
        emps.add(new Employee(12.34));
        emps.add(new Employee(122.34));
        emps.add(new Employee(26345.34));
        outputList(emps);
        System.out.println(emps);
    }

    private static void outputList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
// 1. Generic Type {declaration}
// 2. Parametrized Type {instance}
