package review.package1;

/**
 * 같은 패키지 내 다른 클래스 내에서의 접근
 */
public class AnotherClass {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        modifier.methodPublic();
        modifier.methodProtected();
        modifier.methodDefault();
    }
}
