package chapter7.inherent;

/**
 * final 기타 제어자 예제
 */
public class InherentEx7 {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
//        finalClass.MAX = 20; // 상수라 변경 불가
    }
}

final class FinalClass {
    final int MAX = 10; // 값을 변경할 수 없는 멤버 변수 -> 상수

    final int getMax() {
        return MAX;
    }

}

// 상속 불가
//class FinalClassChild extends FinalClass {
    // 상속할 수 없으므로 오버라이딩도 애초에 불가능
//}

