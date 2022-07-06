package chapter14.optional;

import java.util.Optional;

/**
 * isPresent(), ifPresent()
 */
public class OptionalEx4 {
    public static void main(String[] args) {
        Optional<Object> nullOptional = Optional.ofNullable(null);
        Optional<String> stringOptional = Optional.of("123");

        //isPresent()
        System.out.println(nullOptional.isPresent()); // false
        System.out.println(stringOptional.isPresent()); // true

        //ifPresent()
        nullOptional.ifPresent((i)->System.out.println(i)); //출력X
        stringOptional.ifPresent((i)->System.out.println(i));//123

    }

}
