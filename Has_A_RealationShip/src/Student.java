public class Student {

    private String name;

    private  Address address;

    public Student(String name, Address address,String house, String street, String sector) {
        this.name = name;
        this.address = address;
    }

    public Student(String name,String house, String street, String sector) { // has a relation student acess address
        this.name = name;
        this.address = new Address(house, street, sector);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
