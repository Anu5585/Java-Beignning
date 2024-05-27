package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1);
		p.setFirstName("Usman");
		p.setLastName("Kemal");
		p.setAddress("i8/2");
		p.setMobile("03009887252");

		
//		User u = new User();
//		u.setUsername("Zubair");
//		u.setFirstName("Zubair");
//		u.setLastName("Chatta");
//		u.setMobileNo("03008506565");
//		u.setPassword("123456");
//		u.setEmailId("zubair@szabist-isb.edu.pk");
//		u.setDob("27/11/1974");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		session.save(p);
//		User u1 = (User) session.get(User.class,"Zubair");
//		System.out.println(u1);
		Person p1 = (Person) session.get(Person.class, 1);
		System.out.println(p1.getAddress());
		session.getTransaction().commit();

	}

}
