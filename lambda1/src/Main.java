import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        ints.forEach(x-> System.out.println(x*x));
    }
}