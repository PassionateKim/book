package chapter7.inherent;

public class InherentEx9 {
    public static void main(String[] args) {
//        Animals animals = new Animals(); // 추상 클래스는 인스턴스 생성 불가
        Cat cat = new Cat();
        cat.cry();

        Dog dog = new Dog();
        dog.cry();

    }
}

abstract class Animals {
    abstract void cry();
}
class Cat extends Animals{
    void cry() {
        System.out.println("야옹야옹");
    }
}
class Dog extends Animals{
    void cry() {
        System.out.println("멍멍");
    }
}
