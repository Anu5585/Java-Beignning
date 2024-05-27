import javax.persistence.*;

@Entity
public class Person {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private int personId;
  private String name;
  private int age;
    @OneToOne(mappedBy="person")
    private Address address;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
