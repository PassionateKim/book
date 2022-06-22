package chapter6;

public class Person {
    // 클래스 변수
    static String type = "사람";

    // 인스턴스 변수
    int age;
    String name;
}

class Ex {
    public static void main(String[] args) {
        // Person 객체 생성
        Person miYoung = new Person();
        Person minJu = new Person();


        //이름 나이 넣기
        miYoung.age = 25;
        minJu.age = 21;


        miYoung.name = "miYoung";
        minJu.name = "minJu";

        // 공유되는 클래스 변수 호출
        System.out.println("클래스 변수는 직접 호출 가능 = " + Person.type);
        System.out.println("minJu.type = " + minJu.type);
        System.out.println("miYoung.type = " + miYoung.type);

        // 이름 호출
        System.out.println("minJu.name = " + minJu.name);
        System.out.println("miYoung.name = " + miYoung.name);
    }
}
