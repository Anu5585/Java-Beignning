
public class Main {
    public static void main(String[] args) {
    Apple apple =new Apple("yellow");
    Orange orange = new Orange("yellow");

        System.out.println( apple.equals(orange));
        System.out.println(orange.equals(apple));

    }
}