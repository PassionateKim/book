package chapter7.inherent;

public class InherentEx1 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child.lastName = " + child.lastName);
        child.Shout();
    }
}

class Parent {
    String lastName = "Kim";
}

class Child extends Parent {
    void Shout() {
        System.out.println("나는 Child 입니다.");
    }
}
