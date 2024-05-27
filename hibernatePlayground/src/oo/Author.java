package oo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int author_id;
	
	private String author_name;
	private String author_email;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="author_id",nullable = false)
	private List<Book> books;
	
	public Author(){
		
	}


	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Author(String author_name, String author_email) {
		super();
		this.author_name = author_name;
		this.author_email = author_email;
	}

	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getAuthor_email() {
		return author_email;
	}
	public void setAuthor_email(String author_email) {
		this.author_email = author_email;
	}
	
	
}
