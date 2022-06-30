package chapter11.iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        if (size == 0) {
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
        Object oldObj = null;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        // 삭제하고자 하는 객체가 마지막 객체가 아니면, 배열복사를 통해 빈자리를 채워야 한다.
        if (index != size - 1) {
            System.arraycopy(data, index+1, data, index, size-index-1);
        }
        data[size - 1] = null;
        size--;
        return oldObj;
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
