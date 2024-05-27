public class Person {
   private static Person ref;
    private String name;

    private Person(String name) {
        this.name = name;
    }

    public static Person getInstance(String name) {
        if(ref==null){
            ref = new Person(name);
        }
        return ref;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
