package com.example.add2tableview;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

;

public class MainWindowController {
	private Main main;
	private Stage primaryStage;

	//views
	@FXML TableView<Person> tableView;
	@FXML TableColumn<Person,String> firstNameColumn;
	@FXML TableColumn<Person,String> lastNameColumn;
	@FXML TableColumn<Person,String> ageColumn;

	private ObservableList<Person> personList = FXCollections.observableArrayList();
	Person person  = new Person();

	public void setMain(Main main, Stage primaryStage) {

		this.main = main;
		this.primaryStage = primaryStage;
		setTableData();
		System.out.println("Person List:"+personList);
		tableView.setItems(personList);
	}


	public void initialize(){
		System.out.println("Initilized!!!");



		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
	}

	private void setTableData() {
	//personList.add(new Person(person.getFirstName(), person.getLastName(), person.getAge()));
		personList.add(person);
	}

	private void setTableData(Person another) {
		//personList.add(new Person(person.getFirstName(), person.getLastName(), person.getAge()));
		personList.add(another);
	}




	public void closeButtonClick(){
		primaryStage.close();
		main.secondaryWindow();
	}

}
