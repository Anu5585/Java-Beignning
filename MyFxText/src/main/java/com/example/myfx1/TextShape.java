package com.example.myfx1;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextShape extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName());

		Group root = new Group();
		Text text = new Text(50,100,"Here's a text String");
		text.setFont(Font.font("Verdana",FontWeight.BOLD,FontPosture.ITALIC,50));
		text.setFill(Color.LIGHTSALMON);
		text.setStroke(Color.DARKBLUE);
		text.setUnderline(true);

		root.getChildren().add(text);

		Scene scene = new Scene(root,650,200,Color.LIGHTYELLOW);
		primaryStage.setTitle("Text Shape");
		primaryStage.setScene(scene);
		primaryStage.show();


	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Application.launch(args);
	}



}
