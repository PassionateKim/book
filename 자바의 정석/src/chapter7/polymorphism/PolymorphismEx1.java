package chapter7.polymorphism;

public class PolymorphismEx1 {
    public static void main(String[] args) {
        // 다형성 X

        // 다형성 O 부모가 자식을 참조 가능
        Parent a = new Child();
        a.method(); // 메서드 안에서는 Parent형이어도 자식의 x를 참조
        System.out.println("a.x = " + a.x); // 메서드 밖에서는 부모의 x를 참조
//        System.out.println(child.z); 참조변수의 형에 한해서 멤버와 메서드 참조 가능

        Child child = new Child();

    }
}
class Parent {
    int x = 5;
    int y = 10;
    void method() {
        System.out.println("부모입니다. " + this.x);
    }

}

class Child extends Parent {
    int x = 10;
    int z = 15;

    void method() {
        System.out.println("자식입니다. " + this.x);
    }

}
