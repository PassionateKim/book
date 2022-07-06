package chapter14.optional;

import java.util.Optional;

/**
 * Optional 객체 값 가져오기
 */
public class OptionalEx2 {
    public static void main(String[] args) {

        //get()
        Optional<String> optionalStr1 = Optional.of("abc");
        System.out.println(optionalStr1.get());

//        Optional<Object> optionalStr2 = Optional.ofNullable(null);
//        optionalStr2.get();


        //orElse()
        Optional<String> optionalStr2 = Optional.of("abc");
        Optional<String> optionalStr3 = Optional.ofNullable(null);

        System.out.println(optionalStr2.orElse("null 입니다"));
        System.out.println(optionalStr3.orElse("null 입니다"));

        //orElseGet()
        System.out.println(optionalStr3.orElseGet(() -> "예외"));

        //orElseThrow()
        try {
            System.out.println(optionalStr3.orElseThrow(() -> new NullPointerException()));
        } catch (NullPointerException e) {
            System.out.println("null 입니다.");
        }

    }
}
