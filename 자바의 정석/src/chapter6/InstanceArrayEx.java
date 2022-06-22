package chapter6;

public class InstanceArrayEx {
    public static void main(String[] args) {
        // 참조 변수 배열을 생성하기
        Member[] memberArray = new Member[3];

        // 각 요소에 객체 생성후 주소를 저장
        memberArray[0] = new Member();
        memberArray[1] = new Member();
        memberArray[2] = new Member();

        // memberArray의 각각 member의 id를 0, 1, 2로 만들기
        memberArray[1].idUp();
        memberArray[2].idUp();
        memberArray[2].idUp();

        //출력해보기
        System.out.println("memberArray[0].id = " + memberArray[0].id);
        System.out.println("memberArray[1].id = " + memberArray[1].id);
        System.out.println("memberArray[2].id = " + memberArray[2].id);
    }
}
