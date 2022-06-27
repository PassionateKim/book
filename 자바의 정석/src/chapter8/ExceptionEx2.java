package chapter8;

/**
 * throw 예외 던지기
 */
public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            Exception exception = new Exception("고의로 발생시킨 예외");
            throw exception;
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("시스템 정상 종료");
    }
}
