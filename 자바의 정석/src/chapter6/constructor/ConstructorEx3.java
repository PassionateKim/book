package chapter6.constructor;

public class ConstructorEx3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.color = " + car1.color);
        System.out.println("car1.gearType = " + car1.gearType);
        System.out.println("car1.door = " + car1.door);
    }
}

class Car {
    String color;  // 색
    String gearType; // 변속기 종류 auto, manual
    int door; // 문의 개수

    // 생성자
    Car() {
        this("white", "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}

