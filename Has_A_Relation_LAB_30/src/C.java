public class C extends A{
    private B b;
    public C(){
        this.b=new B();
    }
    public String call(){
        return this.b.call();
    }
}
