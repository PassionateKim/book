package chapter9.string;

/**
 * join
 */
public class StringEx4 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println(String.join("-", a, b, c));
        //a-b-c

        String[] arr = {"a", "b", "c"};
        System.out.println(String.join("-", arr));
        //a-b-c
    }
}