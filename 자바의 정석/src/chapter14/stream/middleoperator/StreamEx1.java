package chapter14.stream.middleoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {

        String[] strArr = {"aaa", "bbb", "ddd"};
        List<String> strList = Arrays.asList(strArr);

        // 스트림으로 변환
        Stream<String> arrStream = Arrays.stream(strArr);
        Stream<String> listStream = strList.stream();

        // 같은 방식으로 정렬하고 출력 가능
        arrStream.sorted().forEach(System.out::println);
        listStream.sorted().forEach(System.out::println);

    }
}
