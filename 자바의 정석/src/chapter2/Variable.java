package chapter2;

public class Variable {
    public static void main(String[] args) {
        /**
         * 변수의 선언
         */
        Boolean trueOrFalse = true;
        char a = 'A';
        int b = 30;
        long c = 30L; //long 형에는 L을 붙여줘야 함
        float d = 30F; // float 형에는 F를 붙여줘야함
        double f = 30;

        System.out.println("trueOrFalse = " + trueOrFalse);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);


        /**
         * 상수
         */
        final int SUM = 100;
        final int COUNT = 5;
        int average = SUM / COUNT;

    }
}
