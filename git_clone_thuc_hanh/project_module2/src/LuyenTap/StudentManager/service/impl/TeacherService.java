package LuyenTap.StudentManager.service.impl;

import LuyenTap.StudentManager.model.Teacher;
import LuyenTap.StudentManager.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher(1, "quang", "12/12/12", "nam", "tutor"));
        teachers.add(new Teacher(2, "hai", "12/12/12", "nam", "coach"));
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teachers
        ) {
            System.out.println(teacher);
        }
    }

    @Override
    public void addTeacher() {
        Teacher teacher = this.TeacherInfor();
        teachers.add(teacher);
        System.out.println("completed");
    }


    @Override
    public void removeTeacher() {
        Teacher teacher = this.TeacherInfor();
        if (teacher == null) {
            System.out.println("Sorry , We did not find !");
        } else {
            System.out.println("Do you really want to delete " + teacher.getId() + " right?");
            System.out.println("1 . Yes !?");
            System.out.println("2 . No !?");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                teachers.remove(teacher);
                System.out.println("completed");
            }
        }
    }

    private Teacher findTeacher() {
        System.out.print("Enter the ID you want to delete ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                return teachers.get(i);
            }
        }
        return null;
    }



    private Teacher TeacherInfor() {
        System.out.print("Please input ID ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Please Written your name: ");
        String name = sc.nextLine();
        System.out.print("Please input your birthday ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Please input your sex ");
        String sex = sc.nextLine();
        System.out.print("Please input your chuyên môn   ");
        String qualification = sc.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, sex, qualification);
        return teacher;
    }
}
