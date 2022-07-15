package practice.ex.chapter12;


public class Chapter12_1 {
    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        /**
         * Box<Object> b = </Object>(Object)new Box<String>();
         * 안되는 이유 고민해보기
         */

        Box2<?> b = new Box2();
        Box2<?> b2 = new Box2<>();
//        Box2<Object> b3 = new Box2<Object>();
//        Box2<Object> b4 = new Box2<>();
        Box2<? extends Fruit> b5 = new Box2<Apple>();
//        Box2<? extends Object> b6 = new Box2<? extends Fruit>();
        Box2<? extends Object> b7 = new Box2<Apple>();
//        Box2<? extends Object> b8 = new Box2<Object>();
    }
}
class Box<T>{
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

}

class Box2<T extends Fruit> {

}


class Fruit {
}

class Apple extends Fruit {
}

