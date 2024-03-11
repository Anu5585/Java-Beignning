
import java.util.*;

public class Boss implements Observer{
  public Boss() 
  {
  }
	
  public void update(String operation, String record)
  {
    System.out.println("The boss says a " + operation +
      " operation was performed on " + record);
  }
}

