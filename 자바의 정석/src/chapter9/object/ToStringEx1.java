package chapter9.object;

public class ToStringEx1 {
    public static void main(String[] args) {
        Card card = new Card(1);
        Card card1 = new Card(2);
        System.out.println("card = " + card);
        System.out.println("card1 = " + card1);
    }
}

/**
 * 직접 toString 오버라이드 해보기
 */
class Card {
    int num;
    Card(int num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return num + "번째 카드입니다.";
    }
}
