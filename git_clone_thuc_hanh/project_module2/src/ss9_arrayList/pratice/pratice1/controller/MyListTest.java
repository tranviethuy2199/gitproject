package ss9_arrayList.pratice.pratice1.controller;

import ss9_arrayList.pratice.pratice1.model.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
//
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));

// các phần tử được thêm vào list
// theo vị trí và phần tử vượt quá số phần tử được thêm vào.
    }
}