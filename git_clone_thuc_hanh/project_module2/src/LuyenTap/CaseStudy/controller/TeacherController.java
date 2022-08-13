package LuyenTap.CaseStudy.controller;

import LuyenTap.CaseStudy.service.ITeacherService;
import LuyenTap.CaseStudy.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController  {
    private static Scanner sc = new Scanner(System.in);
    private ITeacherService teacherService = new TeacherService();

    void teacherService() {
        while (true) {
            System.out.println(" Do you want to add students? - please choice number");
            System.out.println("1. Add new students");
            System.out.println("2. Show student list");
            System.out.println("3. Delete anything Student");
            System.out.println("4. Exit ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1 :
                    teacherService.displayAllTeacher();
                    break;
                case 2 :
                    teacherService.addTeacher();
                    break;
                case 3 :
                   teacherService.removeTeacher();
                    break;
                case 4 :
                    return;
                default:
                    System.out.println("Please enter again !");
            }
        }
    }

}
