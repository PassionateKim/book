package chapter7.innerclass;

public class OuterClass {
    static int a = 3;
    int b = 5;
    //인스턴스 클래스
    class InnerInstance {

    }

    //스태틱 클래스
    static class InnerStatic {

    }

    //지역 클래스
    void method() {
        class InnerLocal {

        }
    }
}
