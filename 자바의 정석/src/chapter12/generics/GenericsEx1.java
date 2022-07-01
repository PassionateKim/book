package chapter12.generics;

/**
 * generics 사용하지 않는 코드
 */
public class GenericsEx1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setField("Name");

        String field = (String)person.getField(); // 형변환이 필요함.
    }
}

class Person {
    Object field;

    public void setField(Object field) {
        this.field = field;
    }

    public Object getField() {
        return field;
    }
}