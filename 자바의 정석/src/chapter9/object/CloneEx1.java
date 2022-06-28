package chapter9.object;

public class CloneEx1 {
    public static void main(String[] args) {
        Person person = new Person(1);
        Person copy = (Person) person.clone();

        person.id = 5;
        System.out.println("copy.id = " + copy.id);



    }
}

/**
 * clone 메서드 사용을 위해선 예외 처리 + Clonable 인터페이스 모두 사용해야 한다.
 */
class Person implements Cloneable {
    int id;
    Person(int id) {
        this.id = id;
    }
    // 다른 패키지의 자식 클래스에서 사용 protected
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (Exception e) {

        }
        return o;
    }
}
