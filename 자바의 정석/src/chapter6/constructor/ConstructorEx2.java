package chapter6.constructor;

public class ConstructorEx2 {
    public static void main(String[] args) {
        Member member = new Member("박슬기");
        System.out.println("member.name = " + member.name);
    }
}

class Member {
    String name;

    Member(String nameParam) {
        name = nameParam;
    }
}
