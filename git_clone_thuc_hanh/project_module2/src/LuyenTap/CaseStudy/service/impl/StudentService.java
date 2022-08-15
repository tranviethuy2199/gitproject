package LuyenTap.CaseStudy.service.impl;

import LuyenTap.CaseStudy.model.Student;
import LuyenTap.CaseStudy.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "quang", "12/12/12", "nam", 10, "c0622g1"));
        students.add(new Student(2, "hai", "12/12/12", "nam", 5, "c0622g1"));
    }

    @Override
    public void addStudent() {
        Student student = this.StudentInfor();
        students.add(student);
        System.out.println("completed");
    }
    private Student StudentInfor() {
        System.out.print("Please input ID :  ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Please Written your name :  ");
        String name = sc.nextLine();
        System.out.print("Please input your birthday : ");
        String birthday = sc.nextLine();
        System.out.print("Please input your sex : ");
        String sex = sc.nextLine();
        System.out.print("Please input your score test :");
        double score = Double.parseDouble(sc.nextLine());
        System.out.print("Please input your name class :");
        String nameClass = sc.nextLine();
        Student student = new Student(id, name, birthday, sex, score,nameClass);
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(birthday);
//        System.out.println(sex);
//        System.out.println(nameClass);
//        System.out.println(score);
        System.out.println(student);
        return student;

    }

    @Override
    public void displayAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Override
    public void removeStudent() {
        Student student = this.findStudent();
        if (student == null) {
            System.out.println("Sorry , We did not find !");
        } else {
            System.out.println("Do you really want to delete" + student.getId() + "right ?");
            System.out.println("1 . Yes !?");
            System.out.println("2 . No !?");
            int choose = Integer.parseInt(sc.nextLine());
            if (choose == 1) {
                student.remove(student);
                System.out.println("delete completed");
            }
        }
    }

    private Student findStudent() {
        System.out.println("Enter the ID you want to delete");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }


}
