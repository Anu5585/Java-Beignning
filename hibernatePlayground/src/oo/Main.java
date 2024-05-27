package oo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Author a = new Author("Zubair","zubair@szabist-isb.edu.pk");
		Book b = new Book("Programming in Java",a);
		Book b2 = new Book("Programming in C++",a);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.save(b);
		//session.save(b2);

		Author a1 = (Author) session.get(Author.class, 1);
		System.out.println(a1.getBooks().size());

//		Book b1 = (Book) session.get(Book.class, 1);
//		System.out.println(b1.getTitle());
		session.getTransaction().commit();
		session.close();

	}

}

//Author zubair = (Author) session.get(Author.class, 3);
//Book scalaBook = new Book("Programming in Scala",zubair);
//session.save(scalaBook);
