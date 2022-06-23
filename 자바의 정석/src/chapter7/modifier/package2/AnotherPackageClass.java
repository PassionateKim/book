package chapter7.modifier.package2;

import chapter7.modifier.package1.Modifier;

// 다른 패키지의 다른 클래스에서의 접근
public class AnotherPackageClass {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        // 멤버 변수
        System.out.println(modifier.publicMember);
//        System.out.println(modifier.protectedMember);
//        System.out.println(modifier.defaultMember);
//        System.out.println(modifier.privateMember);
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
