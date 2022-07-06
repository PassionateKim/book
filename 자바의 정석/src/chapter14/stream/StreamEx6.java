package chapter14.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 스트림 중간 연산 sorted(), peek()
 */
public class StreamEx6 {
    public static void main(String[] args) {

        // 기본 정렬: String의 기본 졍렬에 맞게 정렬된다.
        Stream<String> stream = Stream.of("dd", "aa", "CC", "cc", "x");
        stream.sorted().forEach(System.out::print);

        System.out.println();

        // 람다식 사용 가능
        Stream<String> stream2 = Stream.of("dd", "aa", "CC", "cc", "x");
        stream2.sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::print);

        System.out.println();

        // Comparator의 default 메서드인 comparing 사용
        Stream<String> stream3 = Stream.of("dd", "aa", "CC", "cc", "x");
        stream3.sorted(Comparator.comparing((i) -> i.length())).forEach(System.out::print);

        System.out.println();

        //peek
        int[] intArr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(intArr)
                .peek(s -> System.out.print(s))
                .sum();
        System.out.println();
        System.out.println(sum);

        Stream<String> stream4 = Stream.of("dd", "aa", "CC", "cc", "x");
        stream4.sorted().peek(System.out::print).forEach(System.out::print);
        //CCCCaaaaccccddddxx



    }
}
