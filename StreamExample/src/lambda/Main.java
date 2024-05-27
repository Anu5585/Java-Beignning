package lambda;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //1. writing the lambda expression
        // 2. assign it to a type
        //3. call the method
        Selectable s = ()-> System.out.println("hello");
        s.select();
    }
}