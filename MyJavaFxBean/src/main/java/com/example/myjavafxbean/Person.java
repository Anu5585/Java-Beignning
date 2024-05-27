import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	
	//private String fullName;
	private final StringProperty fullname = new SimpleStringProperty(this,"fullname","");
	//private boolean employed;
	private final BooleanProperty employed = new SimpleBooleanProperty(this,"employed",false);
	
	public final StringProperty fullnameProperty() {
		return this.fullname;
	}
	
//	[P][P][P][P][P][P] // convert -- controls in Javafx (Observable)
//	[O][O][O][O][O][O]	
//  GUI Elements Button ListView, Label, 
	

	public final java.lang.String getFullname() {
		return this.fullnameProperty().get();
	}

	public final void setFullname(final java.lang.String fullname) {
		this.fullnameProperty().set(fullname);
	}

	public final BooleanProperty employedProperty() {
		return this.employed;
	}

	public final boolean isEmployed() {
		return this.employedProperty().get();
	}

	public final void setEmployed(final boolean employed) {
		this.employedProperty().set(employed);
	}


	@Override
	public String toString() {
		return "Person [fullname=" + fullname.get() + ", employed=" + employed.get() + "]";
	}






}
