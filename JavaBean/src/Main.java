public class Main{

    static {
        System.out.println("i am a static block amd i will run when somebody caslls me: java Main");
    }

    static int i=10;
    public static void main(String[] args) {
        System.out.println(foo());
    }
    static int foo(){
        return i;
    }

}