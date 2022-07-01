package chapter11.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        String[] data = {"A","D","A","D", "E", "F", "A", "B", "C"};
        TreeMap map = new TreeMap();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                Integer val = (Integer) map.get(data[i]);
                map.put(data[i], val + 1);
            } else {
                map.put(data[i], 1);
            }
        }

        Iterator iterator = map.entrySet().iterator();
        System.out.println("기본 정렬");
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
