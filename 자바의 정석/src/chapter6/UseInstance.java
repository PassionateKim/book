package chapter6;

public class UseInstance {
    public static void main(String[] args) {
        // 객체 생성
        Member member = new Member();
        System.out.println("member.id = " + member.id);
        // member.id = 0

        // 객체 id 올리는 메서드 사용
        member.idUp();
        System.out.println("member.id = " + member.id);
        // member.id = 1

        // 객체2 생성
        Member member2 = new Member();
        System.out.println("member2.id = " + member2.id);
        // member2.id = 0
        // member와는 독립적인 것이므로 1 이 아니다.
    }
}
