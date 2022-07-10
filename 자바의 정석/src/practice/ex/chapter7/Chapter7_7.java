package practice.ex.chapter7;

public class Chapter7_7 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("x = " + child.getX());
    }
}

class Parent {
    int x = 100;
    Parent() {
        this(200);
    }

    Parent(int x) {
        //super()
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;
    Child() {
        this(1000);
    }

    Child(int x) {
        //super()
        this.x = x;
    }
}