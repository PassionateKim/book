package chapter9.string;

import java.util.StringJoiner;

/**
 * StringJoiner 클래스
 * 양쪽 맨 끝을 정해줄 수 있다.
 */
public class StringEx5 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");

        for (String s : arr) {
            stringJoiner.add(s);
        }

        System.out.println(stringJoiner);
        //[a,b,c]
    }
}
