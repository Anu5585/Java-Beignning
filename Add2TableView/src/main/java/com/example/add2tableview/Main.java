package com.example.add2tableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class Main extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;

		mainWindow();

	}

	public void mainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
			AnchorPane pane = loader.load();
			MainWindowController mainWindowController = loader.getController();

			mainWindowController.setMain(this,primaryStage);

			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void secondaryWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AddNameView.fxml"));
			AnchorPane pane = loader.load();
			AddNameController addNameController = loader.getController();
			Stage secondaryStage = new Stage();

			addNameController.setMain(this,secondaryStage);

			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}






	public static void main(String[] args) {
		launch(args);
	}
}
