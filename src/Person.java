public class Person {
    private String user;
    private int id;

    public Person(java.lang.String userName, int id) {
        this.user = userName;
        this.id = id;
    }

    public java.lang.String getUser() {
        return user;
    }

    public void setUser(java.lang.String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "user=" + user +
                ", id=" + id +
                '}';
    }
}
