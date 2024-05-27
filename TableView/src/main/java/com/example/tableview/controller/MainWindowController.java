package com.example.tableview.controller;



import com.example.tableview.Main;
import com.example.tableview.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class MainWindowController {
	private Main main;
	private Stage primaryStage;

	//views
	@FXML TableView<Person> tableView;
	@FXML TableColumn<Person,String> firstNameColumn;
	@FXML TableColumn<Person,String> lastNameColumn;
	@FXML TableColumn<Person,String> ageColumn;
    @FXML TableColumn<Person, ComboBox> priceColumn;
    


	private ObservableList<Person> personList = FXCollections.observableArrayList();
	ObservableList<String> options = FXCollections.observableArrayList(
            "1",
            "2",
            "3"
            );

	public void setMain(Main main, Stage primaryStage) {
		System.out.println("Chala"+main);
		System.out.println("primary"+primaryStage);
		this.main = main;
		this.primaryStage = primaryStage;
		setTableData();
		System.out.println("Person List:"+personList);
		tableView.setItems(personList);
	}



	private void setTableData() {

		personList.add(new Person("Ahmed","Anees","25",options));
		personList.add(new Person("Kamran","Khan","32",options));
		personList.add(new Person("Dawood","Ahmed","67",options));

	}


	public void initialize(){
		System.out.println("Initilized!!!");
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
		priceColumn.setCellValueFactory(new PropertyValueFactory<Person, ComboBox>("comboBox"));
		
	}

	public void closeButtonClick(){
System.out.println("Close button Called");
	}
	
	 @FXML
	    void foo(ActionEvent event) {
	    	System.out.println("event fired");
	    }


}
