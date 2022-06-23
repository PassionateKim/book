package chapter7.inherent;

public class InherentEx8 {
    public static void main(String[] args) {
        Card card = new Card(1);
        Card card2 = new Card(2);
    }
}

class Card {
    final int id;

    Card(int id) {
        this.id = id;
    }
}
