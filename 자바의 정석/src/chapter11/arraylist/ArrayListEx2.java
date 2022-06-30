package chapter11.arraylist;

import chapter7.modifier.Ex;

import java.util.*;

/**
 * ArrayList 직접 구현해보기
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        MyVector myVector = new MyVector(10);

        System.out.println("myVector.capacity = " + myVector.capacity); // 10
        System.out.println("myVector.size = " + myVector.size); // 10


//        for (int i = 0; i < 10; i++) {
//            myVector.data[i] = i;
//        }
        // contains
        System.out.println(myVector.contains(3));

        try {
            MyVector myVector1 = new MyVector(-1);
        } catch (Exception e) {
            System.out.println("오류");
        }

        for (int i = 1; i < myVector.size(); i++) {
            System.out.println(myVector.get((i)));
        }
        // add
        myVector.add(3);
        myVector.add(4);
        myVector.add(5);

        for (int i = 0; i < myVector.size(); i++) {
            System.out.println("myVector = " + myVector.get(i));
        }


    }
}

class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;
    
    public MyVector() {
        this(10);
    }

    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("배열의 길이는 0이상으로 해야 합니디. 길이를 늘려주세요");
        }
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (data.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object d : data) {
            if (d == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            setCapacity(minCapacity);
        }
    }

    private void setCapacity(int capacity) {
        if (this.capacity == capacity) {
            return;
        }
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    // size랑 length랑 다른 거더라...
    @Override
    public boolean add(Object o) {
        ensureCapacity(size+1);
        data[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public Object set(int index, Object element) {

        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
