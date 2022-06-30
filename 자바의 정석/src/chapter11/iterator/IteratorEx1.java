package chapter11.iterator;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator 구현하기
 * 
 * size 안건드렸는데 왜 10으로 되냐..? -> 다른 패키지의 같은 이름의 클래스를 수정하고 있었음... 이름 중복 하지 말자.
 */
public class IteratorEx1 {
    public static void main(String[] args) {
        MyVector2 myVector2 = new MyVector2();
        myVector2.add(1);
        myVector2.add(2);
        myVector2.add(3);
        myVector2.add(4);

        System.out.println("삭제 전 : " + myVector2);
        Iterator iterator = myVector2.iterator();
        iterator.next();
        iterator.remove();
        iterator.next();
        iterator.remove();

        System.out.println("삭제 후 : " + myVector2);
    }
}

class MyVector2 extends MyVector implements Iterator {
    
    int cursor = 0;
    int lastRet = -1;

    public MyVector2() {
        this(10);
    }
    public MyVector2(int capacity) {
        super(capacity);
    }

    public Iterator iterator() {
        cursor = 0;
        lastRet = -1;
        return this; //리턴 타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미
    }

    //iterator 오버라이드 부분
    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    public void remove() {
        // 삭제할 것이 없으면 IllegalStateException 발생
        if (lastRet == -1) {
            throw new IllegalStateException();
        } else {
            remove(lastRet); // 이건 무슨 메서드여..
            cursor--; // 삭제 후 cursor의 위치 감소
            lastRet = -1;  // lastRet의 값 초기화
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        Iterator it = iterator();
        for (int i = 0; it.hasNext(); i++) {
            if (i != 0) {
                tmp += ", ";
            }
            tmp += it.next();
        }

        return tmp;
    }
}
