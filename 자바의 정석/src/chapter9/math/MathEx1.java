package chapter9.math;

public class MathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        val *= 100;
        System.out.println("val = " + val);
        System.out.println("반올림: " + Math.round(val)); // int 출력
        System.out.printf("버림 %10.2f\n", Math.floor(242140.13535));
        System.out.printf("올림 %10.2f\n", Math.ceil(242140.13535));

        System.out.printf("%10.1f\n", 2.1);
    }
}
