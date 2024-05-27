

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyAnchorPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		DropShadow dropShadow = new DropShadow();
		dropShadow.setOffsetX(4);
		dropShadow.setOffsetY(6);
		dropShadow.setColor(Color.rgb(150,50,50,.688));

		Rectangle square1 = makeSquare(Color.GREEN);
		AnchorPane.setTopAnchor(square1, 10.0);
		AnchorPane.setLeftAnchor(square1, 10.0);

		Rectangle square2 = makeSquare(Color.RED);
		AnchorPane.setBottomAnchor(square2, 10.0);
		AnchorPane.setLeftAnchor(square2, 10.0);

		Rectangle square3 = makeSquare(Color.YELLOW);
		AnchorPane.setTopAnchor(square3, 10.0);
		AnchorPane.setRightAnchor(square3, 10.0);

		Rectangle square4 = makeSquare(Color.BLUE);
		AnchorPane.setBottomAnchor(square4, 10.0);
		AnchorPane.setRightAnchor(square4, 10.0);

		AnchorPane anchorpane = new AnchorPane(square1,square2,square3,square4);
		anchorpane.setEffect(dropShadow);

		Scene scene = new Scene(anchorpane,420,400,Color.LIGHTGREEN);
		primaryStage.setTitle("AnchorPane Layout Example");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Rectangle makeSquare(Color color) {
		Rectangle rectangle = new Rectangle(75,75,color);
		rectangle.setArcHeight(30);
		rectangle.setArcWidth(30);

		return rectangle;
	}

	public static void main(String[] args) {
Application.launch(args);
	}

}
