import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class LineShapes extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Line line1 = new Line(20, 50, 400, 50);
		line1.setStroke(Color.GREEN);
		line1.setStrokeWidth(10);
		line1.setStrokeLineCap(StrokeLineCap.ROUND);

		Line line2 = new Line(20,80,400,80);
		line2.setStroke(Color.BLUE);
		line2.setStrokeWidth(10);
		line2.setStrokeLineCap(StrokeLineCap.ROUND);

		Line line3 = new Line(20,110, 400, 110);
		line3.setStroke(Color.RED);
		line3.getStrokeDashArray().addAll(20d);
		line3.setStrokeWidth(5);

		root.getChildren().addAll(line1,line2,line3);
		Scene scene = new Scene(root,420,200,Color.LIGHTYELLOW);

		primaryStage.setTitle("Line Shape");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
	    Application.launch(args);
	}

}
