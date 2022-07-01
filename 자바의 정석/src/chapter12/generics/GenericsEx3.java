package chapter12.generics;

public class GenericsEx3 {
    public static void main(String[] args) {
        Generics<String> stringGenerics = new Generics<>();
//        Generics<Integer> integerGenerics = new Generics<Integer>(); -> String이 아니므로 컴파일 에러
    }
}

class Generics<T extends String> {
    T member1;

    public T getMember1() {
        return member1;
    }

    public void setMember1(T member1) {
        this.member1 = member1;
    }
}
