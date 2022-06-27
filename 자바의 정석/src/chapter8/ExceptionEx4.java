package chapter8;

import java.io.File;

/**
 * 메서드 예외
 */
public class ExceptionEx4 {
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main에서 예외 처리하였습니다.");
           e.printStackTrace();
            System.out.println("정상종료");
        }
    }
    static void method1() throws Exception {
        method2();
        // method1의 끝
    }
    static void method2() throws Exception {
        throw new Exception();
        // method2의 끝
    }
}
