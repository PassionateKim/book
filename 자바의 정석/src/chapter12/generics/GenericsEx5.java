package chapter12.generics;

public class GenericsEx5 {
    public static void main(String[] args) {
        A<Object> objectA = new A<Object>();
        A<String> stringA = new A<>();

        A<?> aa = new A<String>();
    }
}

class A<T> {

}
