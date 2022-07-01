package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("key1", "1234"); // 값 저장
        hashMap.put("key2", "5678"); // 값 저장

        System.out.println("hashMap: " + hashMap);
        hashMap.put("key1", "덮어쓰기"); // 똑같은 key -> 덮어쓰기

        System.out.println("hashMap: " + hashMap);
        System.out.println(hashMap.get("key1"));

        // entrySet
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {

            /** Map.Entry로 형변환 가능한 이유?
             * 형변환 하는 이유?
             * 다운캐스팅 - 형변환 가시적으로 써줌
             * next()로 받아온 객체는 Map.Entry형임
             */
            Map.Entry e = (Map.Entry) iterator.next();
            e.getValue();
        }
        System.out.println("entrySet = " + entrySet);

        // keySet
        Set keySet = hashMap.keySet();
        System.out.println("keySet = " + keySet);
    }
}
