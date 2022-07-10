package practice.ex.chapter7;

public class Chapter7_20 {
    public static void main(String[] args) {
        Parent1 parent1 = new Child1();
        Child1 child1 = new Child1();

        System.out.println("parent1.x = " + parent1.x);
        System.out.println("child1.x = " + child1.x);

        System.out.println(parent1.getX());
        System.out.println(child1.getX());
    }
}

class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }

    int getX() {
        return x;
    }
}

class Child1 extends Parent1 {
    int x = 200;

    void method() {
        System.out.printf("Child Method");
    }
}