package chapter7.innerclass;

public class InnerEx2 {
    class InstanceInner{};
    static class StaticInner{};

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static은 인스턴스 멤버에 직접 접근할 수 없다.
//        InstanceInner instanceInner = new InstanceInner();
        StaticInner staticInner = new StaticInner();

        // 굳이하려면 외부클래스 먼저 생성해야...
        InnerEx2 innerEx2 = new InnerEx2();
        InstanceInner inner = innerEx2.new InstanceInner();
        System.out.println(cv);
//        System.out.println(iv);
    }

    void instanceMethod() {
        System.out.println(cv); // 클래스 멤버 접근 가능
        System.out.println(iv); // 인스턴스 멤버 접근 가능
    }

    // 지역 클래스는 그냥 메서드안에서 활용되기 위한 클래스일 뿐이다.
    void myMethod() {
        int a = 3;
        class LocalInner{}
        LocalInner localInner = new LocalInner();
    }
}

