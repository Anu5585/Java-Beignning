
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
Thread t = new Thread(()-> System.out.println("Kambda Thread running ...."));
t.start();
       // t.run();
    }
}