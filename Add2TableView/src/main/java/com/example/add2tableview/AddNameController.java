package com.example.add2tableview;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNameController {

@FXML TextField edtfirstname,edtlastname,edtage;
Person person = new Person();
MainWindowController controller = new MainWindowController();

	private Main main;
	private Stage secondaryStage;



	public void initialize(){
		System.out.println("Initilized!!!");
	}


	public void setMain(Main main, Stage secondaryStage) {
		this.main = main;
		this.secondaryStage = secondaryStage;

	}






@FXML public void btninsert(){

	String Name = edtfirstname.getText().toString();
	String LastName = edtlastname.getText().toString();
	String age = edtage.getText().toString();
	person.setFirstName(Name);
	person.setLastName(LastName);
	person.setAge(age);





}

@FXML public void btngoback(){

	secondaryStage.close();
	main.mainWindow();
}






}
