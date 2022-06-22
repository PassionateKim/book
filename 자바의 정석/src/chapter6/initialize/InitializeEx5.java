package chapter6.initialize;
/**
 * 클래스 초기화 순서
 */
public class InitializeEx5 {
    static int x = 4; // 명시적 초기화
    static {
        x = 5; // 클래스 초기화 블럭
    }
    public static void main(String[] args) {
        System.out.println("x = " + x);
        // 4가 아닌 5가 나온다.
        // 클래스 초기화 블럭에서 5로 초기화되었기 때문
    }
}
