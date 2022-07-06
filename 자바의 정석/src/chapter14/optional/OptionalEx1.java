package chapter14.optional;

import java.util.Optional;

/**
 * Optional 생성하기
 */
public class OptionalEx1 {
    public static void main(String[] args) {
        String str = "abcd";

        // 기존 코드
       if (str != null) {
            System.out.println(str);
        }
        // 생성방법 1: of
        Optional<String> optionalStr = Optional.of(str);
        Optional<String> optionalStr2 = Optional.of("abc");

        // 생성방법 2: ofNullable(null) - Null일 가능성이 있는 경우 사용
        // Optional<Object> o = Optional.of(null); //nullPointException 발생
        Optional<String> nullOptional = Optional.ofNullable(null); // 바람직 하진 않음

        // 기본 값으로 초기화할 때는 empty를 사용
        Optional<String> emptyOptional = Optional.empty();
    }
}
