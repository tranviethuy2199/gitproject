package ss9_arrayList.pratice.pratice1.model;

import java.util.Arrays;

public class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;   // cái này là gì !??
        private Object elements[];

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        // tăng kích thước gấp đôi của mảng

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    // phương thức add mục đích thêm một phần tử vào mảng
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }


    // phương thức get trả về vị trí thứ i trong mảng
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}

//