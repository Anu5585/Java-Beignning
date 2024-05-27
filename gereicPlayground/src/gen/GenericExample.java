package gen;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        List<Person> persons = new ArrayList<>();

        emps.add(new Employee("Ali"));
        emps.add(new Employee("Haseeb"));
        emps.add(new Employee("Musab"));
        outputList(emps);

        persons.add(new Person("1234ALPHA"));
        persons.add(new Person("32456BETA"));
        persons.add(new Person("3216THETA"));
        outputList(persons);
    }
    private static void outputList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
