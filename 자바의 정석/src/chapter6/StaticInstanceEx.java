package chapter6;

public class StaticInstanceEx {
    public static void main(String[] args) {
        // 인스턴스 메서드는 인스턴스 생성 후 사용 가능
        Calculator1 instance = new Calculator1();
        int val = instance.instanceAdd();
        System.out.println("val = " + val);

        // 클래스 메서드는 인스턴스 없이 바로 사용가능
        int val2 = Calculator1.classAdd(3, 5);
        System.out.println("val2 = " + val2);
    }
}

class Calculator1 {
    // 인스턴스 변수
    int x = 10, y = 10;
    // 클래스 변수
    static int z = 5;

    // 인스턴스 메서드
    int instanceAdd() {
        System.out.println("z = " + z); // 클래스 변수 호출 가능
        classAdd(3, 5); // 클래스 메서드 호출 가능
        return x + y;
    }

    // 클래스 메서드
    static int classAdd(int a, int b) {
//        System.out.println("x = " + x); // 인스턴스 변수 호출 불가능
//        instanceAdd() // 인스턴스 메서드 호출 불가능

        // 호출후에만 가능
        Calculator1 calculator1 = new Calculator1();

        int x = calculator1.x;
        calculator1.instanceAdd();

        return a + b;
    }
}
