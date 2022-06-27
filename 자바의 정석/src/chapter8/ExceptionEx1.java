package chapter8;

/**
 * printstacktrace
 */
public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            System.out.println(0 / 0);
        } catch (ArithmeticException e) {
            // 참조변수 e를 통해 생성된 ArithmeticException 인스턴스에 접근할 수 있다.
            e.printStackTrace();
            System.out.println("예외발생! = " + e.getMessage());
        } catch (Exception e) {
            System.out.println("이미 위에서 catch하면 아래는 동작하지 않는다.");
        }
    }
}
