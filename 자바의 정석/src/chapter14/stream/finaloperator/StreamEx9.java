package chapter14.stream.finaloperator;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * forEach(), 조건검사 메서드
 */
public class StreamEx9 {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("abcdfe","sadasd","a");
        stringStream.forEach(System.out::println);

        // 조건 검사 메서드
        //allMatch()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        boolean isAllMatch = integerStream.allMatch((i) -> i <= 9);
        System.out.println("isAllMatch = " + isAllMatch);

        //anyMatch()
        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        boolean isAnyMatch = integerStream2.anyMatch((i) -> i <= 1);
        System.out.println("isAnyMatch = " + isAnyMatch);

        //noneMatch()
        Stream<Integer> integerStream3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        boolean isNoneMatch = integerStream3.noneMatch((i) -> i > 9);
        System.out.println("isNoneMatch = " + isNoneMatch);

        //findAny() - 병렬에 사용
        Stream<Integer> integerStream4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> any = integerStream4.filter((i) -> i > 4).findAny();
        System.out.println("any = " + any);

        //findFirst()
        Stream<Integer> integerStream5 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> first = integerStream5.filter((i) -> i > 4).findFirst();
        System.out.println("first = " + first);

    }
}
