package chapter14.stream;

import java.util.stream.Stream;

/**
 * Stream 중간 연산 skip() limit() filter() distinct()
 */
public class StreamEx5 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "2", "3", "4", "5", "6","7","8","9","10");
        stream1.skip(3).limit(5).forEach(System.out::print); //45678
        System.out.println();
        Stream<String> stream2 = Stream.of("1", "1", "1", "2", "3", "4");
        stream2.distinct().filter(i -> i.equals("4")).forEach(System.out::print); //4
    }
}
