package chapter14.functionalinterface;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 컬렉션 프레임워크와 함수형 인터페이스
 */
public class FunctionalInterfaceEx3 {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        //forEach - Consumer
        arrayList.forEach(i -> System.out.print(i+", "));

        //removeIf - Predicate
        arrayList.removeIf(i -> i % 3 == 0);
        System.out.println();
        System.out.println("removeIf -> arrayList = " + arrayList);

        //replaceAll - UnaryOperator - Function과 비슷한 것으로 Function과 달리 입출력 타입이 같다.
        arrayList.replaceAll(i -> i * 10);
        System.out.println("replaceAll -> arrayList = " + arrayList);

        //HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "김수박");
        map.put("2", "이수박");
        map.put("3", "최수박");

        //forEach - BiConsumer
        map.forEach((k,v) -> System.out.print("{" + k + "," + v + "}" + " , "));
    }
}
