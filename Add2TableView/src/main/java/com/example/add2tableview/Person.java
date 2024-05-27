package com.example.add2tableview;

public class Person {
	static private String firstName;
	static private String lastName;
	static private String age;


	public Person(String firstName, String lastName, String age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}



}
