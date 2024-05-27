import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Employee("Ali"));
        list.add("Atif");

        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Employee){
                Employee emp=(Employee) list.get(i);
                System.out.println(emp.getName());

            }else {
                System.out.println(list.get(i));
            }

        }


    }
}