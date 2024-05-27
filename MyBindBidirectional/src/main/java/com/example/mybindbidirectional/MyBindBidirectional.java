import javafx.scene.shape.Circle;

public class MyBindBidirectional {

	public static void main(String[] args) {
		final Circle circle1 = new Circle(10.5);
		final Circle circle2 = new Circle(10.5);

		circle1.radiusProperty().bindBidirectional(circle2.radiusProperty());
		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());

		circle2.setRadius(20.5);
		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());

		circle1.setRadius(30.5);
		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());


		circle1.radiusProperty().unbindBidirectional(circle2.radiusProperty());




	}

}
