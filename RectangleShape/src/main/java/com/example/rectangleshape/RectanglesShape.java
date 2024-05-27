
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectanglesShape extends Application {



	@Override
	public void start(Stage primaryStage) throws Exception {
		int strokeWidth = 3;
		int arcWidth = 30;
		int arcHeight = 30;
		Color strokeColor = Color.BROWN;
		Group root = new Group();

		Rectangle square = new Rectangle(40,40,80,80 );
		square.setFill(Color.LIGHTGRAY);
		square.setStroke(strokeColor);
		square.setStrokeWidth(strokeWidth);

		Rectangle rounded = new Rectangle(180,40,220,80 );
		rounded.setArcWidth(arcWidth);
		rounded.setArcHeight(arcHeight);
		rounded.setFill(Color.CYAN);
		rounded.setStroke(strokeColor);
		rounded.setStrokeWidth(strokeWidth);
		rounded.getStrokeDashArray().addAll(10d,8d);

		root.getChildren().addAll(square,rounded);

		Scene scene = new Scene(root,450,200,Color.LIGHTYELLOW);
		primaryStage.setTitle("Rectangle Shape");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
