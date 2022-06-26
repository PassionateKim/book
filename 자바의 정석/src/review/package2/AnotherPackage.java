package review.package2;

import review.package1.Modifier;
/**
 * 다른 패키지의 상속 클래스 내부에서 상속 클래스가 참조가 가능하다는 것이
 * protected다
 * 다른 패키지의 상속 클래스가 어디서든 protected를 참조 가능하다는 뜻이 아니다.
 */
public class AnotherPackage {
    public static void main(String[] args) {
        // protected 안됨
        Modifier modifier = new Modifier();
        modifier.methodPublic();

        //protected 안됨
        ChildModifier childModifier = new ChildModifier();
        childModifier.methodPublic();
    }
}
