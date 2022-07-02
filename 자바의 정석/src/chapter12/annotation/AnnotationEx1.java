package chapter12.annotation;

import java.util.ArrayList;

public class AnnotationEx1 {
    public static void main(String[] args) {
        @SuppressWarnings({"rawtypes", "deprecation"})
        ArrayList arrayList = new ArrayList();
    }
}

class Parent {
     void method() {

    }
}

class Child extends Parent {
    @Override
    void method() {

    }
}

