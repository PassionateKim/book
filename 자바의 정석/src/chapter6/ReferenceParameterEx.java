package chapter6;

public class ReferenceParameterEx {
    public static void main(String[] args) {
        Number number = new Number();
        number.x = 3; // 객체 number의 멤버변수 x를 3으로 초기화
        System.out.println("초기화 직후 number.x = " + number.x);
        // 초기화 직후 number.x = 3

        // 참조형 변수 변경
        change(number);

        // 변경 후 출력
        System.out.println("참조형 변경 후 number.x = " + number.x);
        // 참조형 변경 후 number.x = 555
    }

    static void change(Number number) {
        number.x = 555;
    }
}

class Number {
    int x; // 멤버변수
}
