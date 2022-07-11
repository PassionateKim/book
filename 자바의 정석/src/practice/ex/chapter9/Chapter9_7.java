package practice.ex.chapter9;

public class Chapter9_7 {
    static boolean contains(String src, String target) {
        if (src.contains(target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
