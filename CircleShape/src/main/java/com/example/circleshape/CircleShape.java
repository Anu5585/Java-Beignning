import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleShape extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	int radius = 40;
	int strokeWidth = 3;
	

	Group root = new Group();

	Color strokeColor = Color.BROWN;
	Circle circle1 = new Circle(120, 100, radius, Color.CORAL);
	circle1.setStroke(strokeColor);
	circle1.setStrokeWidth(strokeWidth);

	Circle circle2 = new Circle(220, 100, radius, Color.YELLOW);
	circle2.setStroke(strokeColor);
	circle2.setStrokeWidth(strokeWidth);

	Circle circle3 = new Circle(320, 100, radius, Color.PALEGREEN);
	circle3.setStroke(strokeColor);
	circle3.setStrokeWidth(strokeWidth);

	root.getChildren().addAll(circle1,circle2,circle3);
//	root.getChildren().add(circle1);
//	root.getChildren().add(circle2);
//	root.getChildren().add(circle3);

	Scene scene = new Scene(root,450,200,Color.LIGHTYELLOW);
	primaryStage.setTitle("Circle Shapes");
	primaryStage.setScene(scene);
	primaryStage.show();

 	}

	public static void main(String[] args) {
		 Application.launch(args);
	}

}
