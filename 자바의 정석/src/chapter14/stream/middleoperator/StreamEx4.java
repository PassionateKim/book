package chapter14.stream.middleoperator;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 그 외부터 스트림 생성
 */
public class StreamEx4 {
    public static void main(String[] args) {
        // 난수
        IntStream intStream = new Random().ints(); // 무한 스트림
        intStream.limit(5).forEach(System.out::println); // 5개만 자르기

        // 특정 범위의 수
        IntStream intStream2 = IntStream.range(1, 10);// 1 2 3 .. 9
        IntStream intStream3 = IntStream.rangeClosed(1, 10); // 1 2 3 .. 10

        Stream<Integer> stream = Stream.iterate(0, n -> n + 2); // 0, 2, 4, 6 ...
        Stream<Integer> stream2 = Stream.generate(() -> 2); // 2, 2, 2, 2
    }
}
