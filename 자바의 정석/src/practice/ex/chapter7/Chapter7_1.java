package practice.ex.chapter7;

public class Chapter7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaDeck {

    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {

        for (int i = 0; i < cards.length; i++) {
            cards[i] = new SutdaCard();
            
            if (i >= 10) {
                cards[i].num = (i - 10) + 1;
            } else {
                cards[i].num = i + 1;
            }
            // 1 3 5일때 광
            if (i == 1 || i == 3 || i == 8) {
                cards[i-1].isKwang = true;
            }
        }


    }//SutdaDeck()

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int idx = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[idx];
            cards[idx] = tmp;
        }
    }//shuffle()

    public SutdaCard pick(int index) {
        if (index < 0 || index >= cards.length) {
            return null;
        }
        return cards[index];
    }//pick()

    public SutdaCard pick() {
        int idx = (int)(Math.random()*20);
        return pick(idx);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, false);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
