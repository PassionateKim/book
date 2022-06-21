package chapter5;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i); // src의 i번째 문자를 ch에 넣는다.
            System.out.println("ch = " + ch);
        }
        char[] chArr = src.toCharArray(); //char 배열로 바꾸기
        System.out.println("chArr = " + Arrays.toString(chArr));
    }
}
