package chapter12.generics;

import java.util.ArrayList;

public class GenericsEx2 {
    public static void main(String[] args) {
        PersonGeneric<String> stringPersonGeneric = new PersonGeneric<String>();

        PersonGeneric<Integer> personGeneric = new PersonGeneric<Integer>();

        stringPersonGeneric.setField("Name");
        String name = stringPersonGeneric.getField();


    }
}

class PersonGeneric<T> {
    T field;
    T[] arr;
    ArrayList<T> list = new ArrayList<T>();
    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    T[] toArray() {
//        T[] ts = new T[10]; 컴파일 시점에 알 수 없으므로 불가능
        return arr;
    }
}
