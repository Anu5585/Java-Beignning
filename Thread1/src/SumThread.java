public class SumThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("suumThread running ....");
    }
}
