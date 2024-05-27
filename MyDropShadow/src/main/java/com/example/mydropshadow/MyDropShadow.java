package com.example.mydropshadow;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyDropShadow extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName());
		Group root = new Group();
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(4);
		dropShadow.setOffsetY(6);
		dropShadow.setColor(Color.rgb(150,50,50,.688));

		Text text = new Text(150,50,"Shadow");
		text.setFont(Font.font("Verdana",FontWeight.BOLD,40));
		text.setFill(Color.DARKGREEN);


		Circle circle = new Circle(180, 120,40,Color.DODGERBLUE);


		Rectangle rectangle = new Rectangle(260, 80,80,80 );
		rectangle.setFill(Color.LIGHTGREEN);


		root.getChildren().addAll(text,circle,rectangle);
		root.setEffect(dropShadow);

		Scene scene = new Scene(root,500,200,Color.LIGHTYELLOW);
		primaryStage.setTitle("DropShadow Effect");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Application.launch(args);
	}

}
