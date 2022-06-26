package review;

public class SuperTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();

        Child2 child2 = new Child2();
        child2.print();
    }
}

class Parent {
    int a = 10;
}

class Child extends Parent {



    void print() {
        /**
         * 모든 인스턴스 메서드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장되는데
         * 이것은 참조변수인 this super의 값이 된다.
         */
        System.out.println(super.a);
        System.out.println(this.a);

    }
}

class Child2 extends Parent {
    int a = 20;
    void print() {
        /**
         * super.x 는 부모 클래스로부터 상속받은 멤버변수 x 를 뜻하며
         * this.x는 자식 클래스에 선언된 멤버변수를 뜻한다.
         */
        System.out.println(super.a);
        System.out.println(this.a);
    }
}
