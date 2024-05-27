import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class MyChangeListener {

	public static void main(String[] args) {
		final Person male = new Person();
		male.setFullname("John Doe");
		male.setEmployed(true);
		System.out.println(male);

		male.fullnameProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println(observable.getValue());
				System.out.println("old value"+oldValue);
				System.out.println("new value"+newValue);


			}
		});


		male.setFullname("John. P Doe.");
	}

}
