public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("Ali");
//        Person p2 = new Person("Atif");

        Person p1 = Person.getInstance("Ali");
        Person p2 = Person.getInstance("Atif");


        System.out.println(p1);
        System.out.println(p2);

    }
}
