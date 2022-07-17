package practice.ex.chapter14;

import java.util.Arrays;
import java.util.OptionalInt;

public class Chapter14_6 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        OptionalInt sum = Arrays.stream(strArr).mapToInt(i -> i.length())
                .max();
        System.out.println("sum = " + sum);
    }
}
