package LuyenTap.StudentManager.controller;

import LuyenTap.StudentManager.service.ITeacherService;
import LuyenTap.StudentManager.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController  {
    private static Scanner sc = new Scanner(System.in);
    private ITeacherService teacherService = new TeacherService();

    public void teacherService() {
        while (true) {
            System.out.println(" Do you want to add students? - please choice number");
            System.out.println("1. Add new Teacher");
            System.out.println("2. Show Teacher list");
            System.out.println("3. Delete any Teacher");
            System.out.println("4. Exit ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1 :
                    teacherService.addTeacher();
                    break;
                case 2 :
                    teacherService.displayAllTeacher();
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
