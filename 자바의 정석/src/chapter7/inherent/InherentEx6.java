package chapter7.inherent;

/**
 * static 기타 제어자 예제
 */
public class InherentEx6 {
    int b = 10;

    static int add(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(InherentEx6.add(100,50));
    }
}
