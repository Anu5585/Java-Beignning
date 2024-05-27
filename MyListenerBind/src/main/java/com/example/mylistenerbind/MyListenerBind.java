import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Circle;

public class MyListenerBind {

	public static void main(String[] args) {
		final Circle circle1 = new Circle(10.5);
		final Circle circle2 = new Circle(10.5);


		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());

		circle2.radiusProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
				circle1.setRadius(newValue.doubleValue());

			}

		});
		
		circle1.radiusProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
				circle2.setRadius(newValue.doubleValue());

			}

		});

		circle1.setRadius(20.5);
		System.out.println("Circle1:"+circle1.getRadius());
		System.out.println("Circle2:"+circle2.getRadius());


	}

}
