package review.package2;

import review.package1.Modifier;

/**
 * 다른 패키지의 상속 클래스 내부에서 상속클래스는 protected가 참조가 가능하다는 것이
 * protected 다
 */
public class ChildModifier extends Modifier {
    public static void main(String[] args) {


        Modifier modifier = new Modifier();
        modifier.methodPublic();
        // 다른 패키지에서의 상속 받은 클래스가 아니므로 접근이 불가능하다.

        ChildModifier childModifier = new ChildModifier();
        childModifier.methodPublic();
        childModifier.methodProtected();
    }
}
