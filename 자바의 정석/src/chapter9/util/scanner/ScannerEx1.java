package chapter9.util.scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = null;
        // 입력받기
        System.out.println(">>");
        String input = scanner.nextLine();

        stringArr = input.split(" +"); // 정규식 사용가능하다는 것이 scanner의 큰 장점

        for (String string : stringArr) {
            System.out.println("string = " + string);
        }
    }
}
