package review.package1;

/**
 * 같은 패키지 내 상속 클래스에서의 접근
 */
public class ChildModifier extends Modifier {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        modifier.methodPublic();
        modifier.methodProtected();
        modifier.methodDefault();
    }
}
