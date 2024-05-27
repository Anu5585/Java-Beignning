import java.lang.*;//implicit
public class Main extends Object{ //implicit
    public static void main(String[] args) {
        Manager m =new Manager();// constructor of manager can be used
        // to intialze its private data
        // even this can be used to set its parent's data
        System.out.println(m.toString());
    }
}
//Rule: Objexct of the parent class will be created before child class
// who enforcees this?  Super
//s: Super keyword
// What is inheritance :
// An object oriented feature that lets us access the public memeber of  class
// and its parents public  features using its object refernce.


