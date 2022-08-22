package ss9_arrayList.homework.controller;


import ss9_arrayList.homework.model.MyArrayList;

public class MyListTest {
    public static class Students {
        private int id;
        private String name;

        public Students(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Students a = new Students(1, "huy");
        Students b = new Students(2, "hoa");
        Students c = new Students(3, "hoàng");
        Students d = new Students(4, "hải");
        Students e = new Students(5, "hưng");




        MyArrayList<Students> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Students student = (Students) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());


        }
    }
}
