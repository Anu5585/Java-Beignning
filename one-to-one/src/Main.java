import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Person p = new Person("Zubair",23);
        Address a = new Address("35","Islamabad",p);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //session.save(p);
        //session.save(a);
//		User u1 = (User) session.get(User.class,"Zubair");
//		System.out.println(u1);
        //Person p1 = (Person) session.get(Person.class, 1);
        //System.out.println(p1.getAddress());
        session.getTransaction().commit();



    }
}