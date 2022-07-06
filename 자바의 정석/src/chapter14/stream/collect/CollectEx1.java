package chapter14.stream.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream -> Collection, array
 */
public class CollectEx1 {
    public static void main(String[] args) {
        //Collectors.toList()
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        List<String> streamToList = stream.collect(Collectors.toList());
        System.out.println("streamToList = " + streamToList);

        //Collectors.toMap()
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");
        Map<Integer, String> streamToMap = stream2.collect(Collectors.toMap((i) -> Integer.parseInt(i), (i) -> "\""+(i)+"\""));
        System.out.println("streamToMap = " + streamToMap);

        //List나 Map이 아닌 컬렉션으로의 변환
        Stream<String> stream3 = Stream.of("1", "2", "3", "4", "5");
        ArrayList<String> streamToArrayList = stream3.collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println("streamToArrayList = " + streamToArrayList);

        // 배열로 변환
        Stream<String> stream4 = Stream.of("1", "2", "3", "4", "5");
        Object[] objects = stream4.toArray();

        Stream<String> stream5 = Stream.of("1", "2", "3", "4", "5");
        String[] stringArray = stream5.toArray((i) -> new String[i]);

    }
}
