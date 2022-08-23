package ss16_Binary_Serialization.practice.copyFile.controller;

import ss16_Binary_Serialization.practice.copyFile.model.student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentReadAndWrite {
    public static void writeToFile(String path, List<student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <students> List<student> readDataFromFile(String path) {
        List<student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<student> students = new ArrayList<>();
        students.add(new student(1, "huy", "da nang"));
        students.add(new student(2, "hoa", "da nang"));
        students.add(new student(3, "han", "da nang"));
        students.add(new student(4, "huynh", "da nang"));
        writeToFile("student.txt", students);
        List<student> studentList = readDataFromFile("student.txt");
        for (student student : studentList) {
            System.out.println(student);
        }


//        List<student> students = new ArrayList<>();
//        students.add(new student(1, "Vũ Kiều Anh", "Hà Nội"));
//        students.add(new student(2, "Nguyễn Minh Quân", "Hà Nội"));
//        students.add(new student(3, "Đặng Huy Hoà", "Đà Nẵng"));
//        students.add(new student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        writeToFile("student.txt", students);
//    }
    }
}



