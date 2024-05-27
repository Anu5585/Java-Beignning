package com.example.mygridpane;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyGridPane extends Application {

	private final Color colors[] = {Color.ORANGE,Color.BLACK,Color.RED,Color.PINK,Color.WHITE,Color.GREEN,Color.CYAN,Color.BLUE};

	@Override
	public void start(Stage primaryStage) throws Exception {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(4);
		dropShadow.setOffsetY(6);
		dropShadow.setColor(Color.rgb(150,50,50,.688));

		GridPane gridpane = new GridPane();
		gridpane.setHgap(25);
		gridpane.setVgap(25);
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setEffect(dropShadow);
		gridpane.setGridLinesVisible(true);

		int index =0;
		gridpane.add(new Circle(50,colors[index++]),0,0);
		gridpane.add(new Rectangle(50,220,colors[index++]),1,0,1,2);
		gridpane.add(new Circle(40,colors[index++]),2,0);
		gridpane.add(new Rectangle(50,70,colors[index++]),0,1);
		gridpane.add(new Rectangle(180,100,colors[index++]),0,2,2,1);
		gridpane.add(new Circle(30,colors[index++]),2,2);

		gridpane.getChildren().stream().forEach((node) ->{
			GridPane.setHalignment(node, HPos.CENTER);
			GridPane.setValignment(node, VPos.CENTER);

		});

		Scene scene = new Scene(gridpane,420,400,Color.LIGHTGREEN);
		primaryStage.setTitle("Grid Layout Example");
		primaryStage.setScene(scene);
		primaryStage.show();



	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
