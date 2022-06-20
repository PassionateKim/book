package chapter3;

public class OperatorEx3 {
    public static void main(String[] args) {
        int a = 1000000; // 100만
        int b = 1000000; // 100만

        long d = (long)a * b; // 형변환 안하면 오버 플로우 발생
        System.out.println("d = " + d);
    }
}
