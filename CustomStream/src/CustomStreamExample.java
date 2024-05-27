

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class CustomStream<T> {
    private List<T> data;
    private CustomStream(List<T> data) {
        this.data = data;
    }

    public static <T> CustomStream<T> of(List<T> data) {
        CustomStream<T> ref = new CustomStream<>(data);
        System.out.println(ref);
        return ref;
    }
    public CustomStream<T> filter(Predicate<T> predicate) {
        List<T> filteredData = new ArrayList<>();
        for (T item : data) {
            if (predicate.test(item)) {
                filteredData.add(item);
                System.out.println(item);
            }
        }
        CustomStream<T> ref =new CustomStream<>(filteredData);
        System.out.println("size of list"+ref.data.size());
        return ref;
    }


    public <R> CustomStream<R> map(Function<T, R> mapper) {
        List<R> mappedData = new ArrayList<>();
        for (T item : data) {
            mappedData.add(mapper.apply(item));
        }
        return new CustomStream<>(mappedData);
    }

    public void forEach(Consumer<T> action) {
        for (T item : data) {
            action.accept(item);
        }
    }
}

public class CustomStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        CustomStream.of(numbers)
                .filter(x -> x % 2 == 0)       // Filter even numbers
                .map(x -> x * x)                // Square each number
                .forEach(System.out::println);  // Print the result
    }
}