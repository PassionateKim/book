package practice.ex.chapter14;

import java.util.stream.Stream;

public class Chapter14_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        Stream<String> stream = Stream.of(strArr);
        int sum = stream.mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);

    }
}
