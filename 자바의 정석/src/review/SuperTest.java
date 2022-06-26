package review;

public class SuperTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();

        Child2 child2 = new Child2(30);
        child2.print();
    }
}

class Parent {
    int a;

    Parent() {
        a = 10;
    }
}

class Child extends Parent {

    void print() {
        System.out.println(super.a); // 둘다 super()에 의해 초기화된 부모의 멤버변수인지?
        System.out.println(this.a); // 둘다 super()에 의해 초기화된 부모의 멤버변수인지?
        // this.a도 부모의 멤버변수라면 this라는 문법에 의해 어떻게 호출될 수 있는지?
        /**
         * variable hiding 개념
         * Child는 자식 클래스에 멤버변수가 없으므로 둘다 부모의 멤버변수를 참조한다.
         * 하지만 child2처럼 자식 클래스에 같은 이름의 멤버변수가 있는 경우
         * 부모의 멤버변수를 참조하던 this.a가 부모의 멤버변수를 숨기고 자식 클래스의 멤버변수를 참조하게 된다.
         */
    }
}

class Child2 extends Parent {
    int a = 20;

    Child2(int a){
        super();
        this.a = a;
//        Parent(); // super 대신 직접 하면 왜 안됨? 저건 부모 생성자를 가리키는 문법이 아니기 때문이다.
    }
    void print() {
        /**
         * super.x 는 부모 클래스로부터 상속받은 멤버변수 x 를 뜻하며
         * this.x는 자식 클래스에 선언된 멤버변수를 뜻한다.
         */
        System.out.println(super.a);
        System.out.println(this.a);
    }
}
