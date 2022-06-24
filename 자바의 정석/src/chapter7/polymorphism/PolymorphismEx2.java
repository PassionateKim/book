package chapter7.polymorphism;

public class PolymorphismEx2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

//        Child child2 = new Parent();
        // 부모 -> 자식 (형변환 필수)
        // ClassCastException
//        child = (Child)parent;
        parent = child;
        parent.method();
    }
}
