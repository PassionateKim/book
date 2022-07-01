package chapter12.generics;

import java.util.List;

public class GenericEx5 {
    public static void main(String[] args) {

    }
}

class Member<T> {
    T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
    //지네릭 메서드의 T와 멤버와 클래스 선언부의 T는 다른 것이다.
    static <T> void getParamList(List<T> list) {

    }
}
