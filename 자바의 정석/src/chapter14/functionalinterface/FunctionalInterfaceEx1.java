package chapter14.functionalinterface;

import java.util.concurrent.Callable;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * function 패키지 활용해보기
 */
public class FunctionalInterfaceEx1 {
    public static void main(String[] args) {
        // 매개변수 X, 반환값 X
        Runnable runnable = () -> System.out.println("하하하");
        runnable.run();

        // 매개변수 X, 반환값 O
        Supplier<Integer> supplier = () -> ((int) (Math.random() * 100));
        System.out.println("supplier.get(): " + supplier.get());

        // 매개변수 O, 반환값 X
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello");

        // 매개변수 1개, 반환값 O
        Function<String, String> function = s -> (s + "입니다.");
        System.out.println("function 반환값: " + function.apply("ㅇㅇㅇ"));

        // 매개변수 1개, 반환 타입 boolean
        Predicate<Integer> predicate = a -> a < 100;
        System.out.println("predicate = " + predicate.test(10));

    }
}
