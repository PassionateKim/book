package chapter2;

import java.util.Scanner;

public class PrintEx {
    public static void main(String[] args) {
        String url = "www.naver.com";

        int a = 10;
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.234556789;

        //줄 간격 맞추기
        System.out.printf("a = [%05d]\n", a);
        System.out.printf("f1 = [%10f]\n", f1);

        //화면에서 입력 받기
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("input = " + input);

    }
}
