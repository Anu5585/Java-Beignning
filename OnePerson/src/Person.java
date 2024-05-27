public class Person {
    private static Person objRef =null;
private Person(){

}
public static Person getInstance(){
    if(objRef == null) {
        objRef = new Person();
    }

return objRef;

}
}
