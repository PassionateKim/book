package chapter14.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * 매개변수가 2개인 함수형 인터페이스
 */
public class FunctionalInterfaceEx2 {
    public static void main(String[] args) {
        // 매개 변수 2개인 Consumer
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a+b);
        biConsumer.accept("hello", " world");
        
        // 매개 변수 2개인 Predicate
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + b < 10;
        System.out.println("biPredicate.test(1,4) = " + biPredicate.test(1,4));

        // 매개 변수 2개인 Function
        BiFunction<String, String, String> biFunction = (a,b) -> a+b;
        System.out.println("biFunction.apply(\"Hello\", \"World\") = " + biFunction.apply("Hello", " World"));
    }
}
