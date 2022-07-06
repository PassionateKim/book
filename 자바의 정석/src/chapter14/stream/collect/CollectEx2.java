package chapter14.stream.collect;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 통계
 */
public class CollectEx2 {
    public static void main(String[] args) {

        //count - 기존
        Stream<Integer> Stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        long count = Stream1.count();
        System.out.println("count = " + count);

        //counting - collect
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Long count2 = stream2.collect(Collectors.counting());
        System.out.println("count2 = " + count2);

        //sum - 기존
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        int sum1 = stream3.mapToInt(i -> i).sum();
        System.out.println("sum1 = " + sum1);

        //summingInt - collect
        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Integer sum2 = stream4.collect(Collectors.summingInt(i -> i));
        System.out.println("sum2 = " + sum2);

        //max - 기존
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> max = stream5.max(Comparator.comparingInt(i -> i));
        System.out.println("max = " + max);

        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> max2 = stream6.collect(Collectors.maxBy(Comparator.comparingInt(i -> i)));
        System.out.println("max2 = " + max2);

        //reduce - 기존
        Stream<Integer> stream7 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Integer val1 = stream7.reduce(0, (a, b) -> a + b);
        System.out.println("val1 = " + val1);

        //reducing - collect
        Stream<Integer> stream8 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Integer val2 = stream8.collect(Collectors.reducing(0, (a, b) -> a + b));
        System.out.println("val2 = " + val2);
    }
}
