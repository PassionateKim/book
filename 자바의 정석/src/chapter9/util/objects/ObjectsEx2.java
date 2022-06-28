package chapter9.util.objects;

import java.util.Objects;

/**
 * deepEquals
 */
public class ObjectsEx2 {
    public static void main(String[] args) {
        String[][] array1 = new String[][]{{"1", "2"}, {"2", "3"}};
        String[][] array2 = new String[][]{{"1", "2"}, {"2", "3"}};

        System.out.println(Objects.equals(array1, array2));
        System.out.println(Objects.deepEquals(array1, array2));
    }
}
