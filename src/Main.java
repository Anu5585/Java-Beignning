public class Main {
    public static void main(String[] args) {
        int count = 0 ;
        Person P = new Person("Muhammad", ++count);
        Person P1 = new Person("Annas", ++count);
        Person P2 = new Person("Khalid", ++count);
        Person P3 = new Person("Khalid2", ++count);
        System.out.println(P);
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
    }

}