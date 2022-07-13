package practice.ex.chapter11;

import java.util.HashSet;
import java.util.Objects;

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SutdaCard) {
            SutdaCard sutdaCard = (SutdaCard) o;
            return num == sutdaCard.num && isKwang == sutdaCard.isKwang;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Chapter11_11 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet<Object> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);
    }
}
