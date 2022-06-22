package chapter6.initialize;

/**
 * 인스턴스 초기화 순서
 */
public class InitializeEx6 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("apple.old = " + apple.old);
        // 6
    }
}

class Apple {
    int old = 4; //1. 명시적 초기화
    {
        this.old = 5; // 2. 인스턴스 초기화 블럭
    }
    Apple() {
        System.out.println("old = " + old);
        // 5
        this.old = 6; // 3. 생성자 초기화
    }
}
