package chapter7.abstractex;
/**
 * 추상 클래스
 */
abstract class Fruit {
    abstract void Print();
}

class Apple extends Fruit {
    @Override
    void Print() {
        System.out.println("나는 사과입니다."); // 추상 메서드 구현
    }
}

class Peach extends Fruit {
    @Override
    void Print() {
        System.out.println("나는 복숭아입니다."); // 추상 메서드 구현
    }
}
