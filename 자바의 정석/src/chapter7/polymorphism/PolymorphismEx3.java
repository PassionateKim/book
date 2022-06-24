package chapter7.polymorphism;

public class PolymorphismEx3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent2 = new Child();
        Child child = new Child();

        System.out.printf("parent instanceof Parent = %b\n", parent instanceof Child);
        //parent instanceof Parent = false
        System.out.printf("parent instanceof Parent = %b\n", parent2 instanceof Child);
        //parent instanceof Parent = true

        // 자식 타입으로 형변환 해보기
//        parent = (Child) parent; // ClassCaseException 오류
        parent2 = (Child) parent2; // 가능 instanceof 가 true이므로
    }
}
