package someclass;

public class SomeClass {
    public void PrintAverage(IAverage ref) {
        System.out.println("ref = " + ref.Avg(3, 7, 8));
    }
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.PrintAverage((a,b,c) -> (a+b+c)/3.0);
    }
}
