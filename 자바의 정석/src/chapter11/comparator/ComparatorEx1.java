package chapter11.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx1 {
    public static void main(String[] args) {
        Integer inti = 4;
        System.out.println(inti.compareTo(3));

        String[] strArr = {"A", "B", "F", "C", "D"};

        Arrays.sort(strArr, new Descending());
        for (String s : strArr) {
            System.out.println("s = " + s);
        }
        System.out.println(Arrays.toString(strArr));
    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1; // 자식 타입인지를 체크해야함
            Comparable c2 = (Comparable) o2; // 자식 타입인지를 체크해야함
            return c1.compareTo(c2) * -1; // 역순
        }
        return -1;
    }
}