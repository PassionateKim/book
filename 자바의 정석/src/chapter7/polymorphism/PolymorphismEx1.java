package chapter7.polymorphism;

public class PolymorphismEx1 {
    public static void main(String[] args) {
        // 다형성 X

        // 다형성 O 부모가 자식을 참조 가능
        Parent a = new Child();
        a.method();
//        System.out.println(child.z); 참조변수의 형에 한해서 멤버와 메서드 참조 가능

        Parent parent = new Parent();
        Child child = new Child();

    }
}
class Parent {
    int x = 5;
    int y = 10;
    void method() {
        System.out.println("부모입니다.");
    }
}

class Child extends Parent {
    int z = 15;

    void method() {
        System.out.println("자식입니다");
    }

}
