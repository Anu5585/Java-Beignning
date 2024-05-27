public class Main {
    public static void main(String[] args) {
        Payable p = new MyImpl();
        p.foo();
        Payable pp = () -> System.out.println("Impl from lambda") ;
        pp.foo();
    }
}
//1. write the lambda expression
//2.asign it to a typw
//3. call the method