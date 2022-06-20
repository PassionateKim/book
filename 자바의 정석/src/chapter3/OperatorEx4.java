package chapter3;

public class OperatorEx4 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c3 = (char) (c1 + 1); // 덧셈 결과가 int형이므로 자동 형변환 불가
        System.out.println("c3 = " + c3); //c3 = B

        char c2 = '0';
        int a = c1 + c2; // 덧셈 결과가 char형이므로 자동 형변환
        System.out.println("a = " + a); //a = 113
    }
}
