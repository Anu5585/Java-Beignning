package com.example.tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class Person {
	private String firstName;
	private String lastName;
	private String age;
	private ComboBox comboBox;
	
	
//final ComboBox comboBox = new ComboBox(options);


	public Person(String firstName, String lastName, String age, ObservableList<String> options) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
		this.comboBox = new ComboBox(options);
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

	public ComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(ComboBox comboBox) {
		this.comboBox = comboBox;
	}



}
