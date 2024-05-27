public class C extends A{
    B b ;
    public int call(){
        return b.call();
    }

    public C() {
        this.b = new B();
    }
}
