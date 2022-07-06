package chapter14.stream.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문자열 결합
 */
public class CollectEx3 {
    public static void main(String[] args) {
        // 매개변수가 1개
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5", "6");
        String joining = stream.collect(Collectors.joining(","));
        System.out.println("joining = " + joining);

        // 매개변수가 3개
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5", "6");
        String joining2 = stream2.collect(Collectors.joining(",", "[", "]"));
        System.out.println("joining2 = " + joining2);

    }
}
