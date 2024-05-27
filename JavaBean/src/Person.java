public class Person {
    private String firstName;
    private int id;
   static int count;

    public Person(String firstName) {
        this.firstName = firstName;
        this.id = ++count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}
