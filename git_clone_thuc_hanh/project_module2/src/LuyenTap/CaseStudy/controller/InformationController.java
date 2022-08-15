package LuyenTap.CaseStudy.controller;

import LuyenTap.CaseStudy.service.IStudentService;
import LuyenTap.CaseStudy.service.ITeacherService;

import java.util.Scanner;

public class InformationController {

    Scanner sc = new Scanner(System.in);
    StudentController studentController = new StudentController();
    TeacherController teacherController = new TeacherController();

    public void menuManagement() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println(".Wellcome to CODE GYM Center class");
            System.out.println("1.Student Information   ");
            System.out.println("2.Teacher Information");
            System.out.println("3.Exit");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1 ) {
                studentController.studentInformation();
            }else if (choice == 2 ) {
                teacherController.teacherService();
            }else if (choice == 3){
                return;
            }else {
                System.out.println("Please enter again !");
            }
        }
    }
}
