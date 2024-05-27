import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class MyInvalidationListener {

	public static void main(String[] args) {
		final Person male = new Person();
		male.setFullname("John Doe");
		male.setEmployed(true);
		System.out.println(male);
		
		InvalidationListener myListener = new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				System.out.println(observable);
				System.out.println("Invaidated .....");
				
			}
		};



		male.fullnameProperty().addListener(myListener);
		male.setFullname("John. P. Doe");
		System.out.println(male);
		//male.fullnameProperty().removeListener(myListener);
		//male.setFullname("John. Doe....");
	}

}
