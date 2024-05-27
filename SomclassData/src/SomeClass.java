import java.util.Arrays;
import java.util.List;

public class SomeClass {
     List<Integer> integers = Arrays.asList(1,2,3,4,5,7,8,9,9,9);

    public void PrintAverage(IAverage ref) {
        System.out.println("ref = " + ref.Avg(3, 7, 8));
    }
/*    public void PrintSum(ISum ref) {
        for (int i=0;i<integers.size();i++){
            ref.Sum();
        }

    }*/
}
