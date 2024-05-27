import javafx.scene.shape.Circle;

public class MyBind {

	public static void main(String[] args) {
		// const
		final Circle circle1 = new Circle(10.5);
		final Circle circle2 = new Circle(10.5);

		circle1.radiusProperty().bindBidirectional(circle2.radiusProperty());
		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());

		if(circle1.radiusProperty().isBound()){
			System.out.println("Circle1's radius property is bound");
		}

		circle2.setRadius(20.5);//circle1.setRadius(20.5);

		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());

		circle1.radiusProperty().unbind();
		if(!circle1.radiusProperty().isBound())
			System.out.println("Circle1 radius property is unbound");

		circle2.setRadius(30.5);
		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());
	}

}
