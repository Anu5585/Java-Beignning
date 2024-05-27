package oo;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;


@Entity
public class Book {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int book_id;
	private String title;
	// we cannot specify @column with @one-to-one
/*	@ManyToOne(cascade=CascadeType.ALL)// if we don't specify @joincolumn
	@JoinColumn(name="author_id")//it will name it author_author_id
	private Author author; */
	
	public Book(){
		
	}
	public Book(String title, Author author) {
		super();
		this.title = title;
		//this.author = author;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
