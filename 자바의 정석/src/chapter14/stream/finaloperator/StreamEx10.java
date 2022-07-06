package chapter14.stream.finaloperator;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * reduce()
 */
public class StreamEx10 {
    public static void main(String[] args) {
        Integer[] intArr = {11, 10, 5, 2};

        Stream<Integer> stream = Stream.of(intArr);

        Integer sum = stream.reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum); //sum = 28

        Stream<Integer> stream2 = Stream.of(intArr);
        Integer max = stream2.reduce((Integer.MIN_VALUE), (a, b) -> a > b ? a : b);
        System.out.println("max = " + max);

        Stream<Integer> stream3 = Stream.of(intArr);
        Optional<Integer> max2 = stream3.reduce(Integer::max);
        System.out.println("max2 = " + max2);

    }
}
