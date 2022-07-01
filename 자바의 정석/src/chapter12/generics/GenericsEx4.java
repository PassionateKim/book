package chapter12.generics;

import java.util.ArrayList;

public class GenericsEx4 {
    public static void main(String[] args) {

        //형변환
        FruitBox<? extends Fruit> fBox = new FruitBox<Fruit>();
        FruitBox<? extends Fruit> aBox = new FruitBox<Apple>();

        FruitBox<Fruit> fruitFruitBox = new FruitBox<>(); //Fruit의 자식까지 가능
        FruitBox<Apple> appleFruitBox = new FruitBox<>(); //Apple의 자식까지 가능

        fruitFruitBox.add(new Apple()); //Fruit 의 자식이므로 가능
        fruitFruitBox.add(new Grape()); //Fruit 의 자식이므로 가능
        appleFruitBox.add(new Apple()); //Apple만 가능
        appleFruitBox.add(new Apple()); //Apple만 가능

        // 둘다 가능한 이유 <? extends Fruit>로 Fruit 이하까지 가능하도록 상한을 두었기 때문
        System.out.println(Juicer.<Fruit>makeJuice(fruitFruitBox)); //Apple Grape Juice
        System.out.println(Juicer.<Apple>makeJuice(appleFruitBox)); //Apple Apple Juice
    }
}

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class FruitBox<T extends Fruit> extends Box<T>{}  //FruitBox에 Fruit 포함 그 자식까지 올 수 있음.

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    ArrayList<T> getList() {
        return list;
    }

}
class Juicer {
    static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {//<? extends Fruit>로 Fruit 이하까지 가능하도록 상한
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

