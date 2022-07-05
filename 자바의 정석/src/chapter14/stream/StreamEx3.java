package chapter14.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 배열에서 스트림 생성하기
 */
public class StreamEx3 {
    public static void main(String[] args) {

        //Stream 클래스의 of 사용
        Stream<String> stream1 = Stream.of("a", "b", "c"); // 가변인자
        Stream<String> stream2 = Stream.of(new String[]{"a", "b", "c"});

        //Arrays 클래스의 stream 사용
        Stream<String> stream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> stream4 = Arrays.stream(new String[]{"a", "b", "c"},0,2);

    }
}
