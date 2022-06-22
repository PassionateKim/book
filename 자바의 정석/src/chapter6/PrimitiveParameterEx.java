package chapter6;

public class PrimitiveParameterEx {
    public static void main(String[] args) {
        int a = 30;

        change(a);

        // 변경 시도 후 a 출력
        System.out.println("a = " + a);
        // a = 30 <- 20으로 변하지 X
    }

    static void change(int x) {
        // 변경 시도
        x = 20;
    }
}
