package chapter7.modifier.package2;

import chapter7.modifier.package1.Modifier;

public class AnotherPackageClass {
    public static void main(String[] args) {

        ChildInAnotherPackageClass childInAnotherPackageClass = new ChildInAnotherPackageClass();
        System.out.println(childInAnotherPackageClass.publicMember);
        // 왜 protected 접근이 안되냐?

    }
}

class ChildInAnotherPackageClass extends Modifier {

    public static void main(String[] args) {

        ChildInAnotherPackageClass childInAnotherPackageClass = new ChildInAnotherPackageClass();
        // 멤버 변수
        System.out.println(childInAnotherPackageClass.publicMember);
        System.out.println(childInAnotherPackageClass.protectedMember);


        /**
         * modifier는 다른 패키지에서의 상속받은 클래스가 아니므로 접근 불가능하다.
         */
        Modifier modifier = new Modifier();
//        System.out.println(modifier.protectdMember);
    }
}
