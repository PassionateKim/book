package chapter4;

import java.util.Scanner;

public class FlowEx1 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

        if (score >= 90) {
            grade = 'A';
        } else if (80 <= score) {
            grade = 'B';
        } else if (70 <= score) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("학점 = " + grade);
    }
}
