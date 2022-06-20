package chapter3;

public class OperatorEx7 {
    public static void main(String[] args) {
        int a = 9;

        System.out.printf("a는 1이상 그리고 10이하이다  = %b\n", 1<=a && a<=10);
        System.out.printf("a는 1이상 또는 -100미만이다.  = %b\n", 1<=a || a<-100);
        System.out.printf("a는 9가 아니다. = %b\n", !(a == 9));
    }
}
