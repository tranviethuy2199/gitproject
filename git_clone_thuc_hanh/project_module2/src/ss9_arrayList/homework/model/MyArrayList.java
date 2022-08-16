package ss9_arrayList.homework.model;

import java.util.Arrays;

public class   MyArrayList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];


    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) throws IllegalAccessException {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalAccessException("capacity" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

//    public void add(E element, int index) {
//        if (index > elements.length) {
//            throw new IllegalArgumentException("index" + index);
//        } else if (elements.length == size) {
//            this.ensureCapacity(5);
//        }
//
//        if (elements[index] == null) {
//            elements[index] = element;
//            size++;
//        } else {
//            for (int i = size + 1; i >= index; i--) {
//                elements[i] = elements[i - 1];
//            }
//            elements[index] = element;
//            size++;
//        }
//    }


    public void ensureCapacity(int minCapacity) throws IllegalArgumentException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);

        }
    }

    public E get(int index) {
        return (E)  elements[index];
    }


    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return 1;
            }
        }
        return index;
    }



    public boolean contain(E element) {
        return this.indexOf(element) >= 0;
    }


}
