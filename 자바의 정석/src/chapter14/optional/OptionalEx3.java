package chapter14.optional;

import java.util.Optional;

/**
 * 스트림처럼 사용하는 메서드 filter(), map(), flatMap()
 */
public class OptionalEx3 {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("123");
        int integer = s.filter(i -> i.length() > 0)
                       .map(Integer::parseInt)
                       .orElse(3);
        System.out.println(integer); //123
    }
}
