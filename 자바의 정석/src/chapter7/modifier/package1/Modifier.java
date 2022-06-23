package chapter7.modifier.package1;

public class Modifier {
    // 멤버 변수
    public String publicMember = "public 멤버 변수";
    protected String protectedMember = "protected 멤버 변수";
    String defaultMember = "default 멤버 변수";
    private String privateMember = "private 멤버 변수";


    // 동일 패키지 내 같은 클래스에서 모두 접근 가능
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        // 멤버 변수
        System.out.println(modifier.publicMember);
        System.out.println(modifier.protectedMember);
        System.out.println(modifier.defaultMember);
        System.out.println(modifier.privateMember);

    }
}
// 동일 패키지 내 상속 클래스 접근
class ChildModifier extends Modifier {
    public static void main(String[] args) {
        ChildModifier childModifier = new ChildModifier();
        // 멤버 변수
        System.out.println(childModifier.publicMember);
        System.out.println(childModifier.protectedMember);
        System.out.println(childModifier.defaultMember);
//        System.out.println(childModifier.privateMember);

    }
}

// 동일 패키지 내 다른 클래스 접근
class AnotherClass {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        // 멤버 변수
        System.out.println(modifier.publicMember);
        System.out.println(modifier.protectedMember);
        System.out.println(modifier.defaultMember);
//        System.out.println(modifier.privateMember);
    }
}

