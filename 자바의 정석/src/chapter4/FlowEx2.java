package chapter4;

public class FlowEx2 {
    public static void main(String[] args) {
        /**
         * break가 없으면 조건을 만족하는 곳으로부터
         * 쭉 아래의 코드가 모두 실행된다.
         * 스위치문은 제약조건이 있다.
         * 1. 조건식 결과는 정수 또는 문자열이여야 한다.
         * 2. case문의 값은 정수 상수만 가능하며, 중복되면 안된다.
         */
        int level = 2;
        switch (level) {
            case 3:
                System.out.println("3 = " + 3);
            case 2:
                System.out.println("2 = " + 2);
            case 1:
                System.out.println("1 = " + 1);
        }
        //2 = 2
        //1 = 1
    }
}
