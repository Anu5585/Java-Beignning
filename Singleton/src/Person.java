public class Person {
private static Person instance;
     private Person(){}

    public static Person getInstance() {
         if(instance == null)
        instance = new Person(); 
        return instance;
    }
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1);
        System.out.println(p2);
    }
}
