package chapter3;

public class OperatorEx6 {
    public static void main(String[] args) {
        float f = 0.1f; //0.1은 이진수로 저장할 때 오차가 발생한다.
        double d = 0.1;
        double d2 = (double) f;
        System.out.printf("d==f %b\n", d==f); // d==f false
        System.out.printf("d==d2 %b\n", d==d2); // d==d2 false
        System.out.printf("f==d2 %b\n", f==d2); // f==d2 true
        System.out.printf("float(d)==f %b\n", (float)d==f); // float(d)==f true
    }
}
