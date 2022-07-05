package chapter14.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * Collection 에서 Stream 생성하기
 */
public class StreamEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        HashSet<String> strings = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        Stream<Integer> stream = integers.stream();
        Stream<String> stream2 = strings.stream();

        stream.forEach(System.out::print);
    }
}
