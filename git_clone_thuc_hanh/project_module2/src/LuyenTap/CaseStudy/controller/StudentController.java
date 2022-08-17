package LuyenTap.CaseStudy.controller;

import LuyenTap.CaseStudy.service.IStudentService;
import LuyenTap.CaseStudy.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner sc = new Scanner(System.in);
    private IStudentService studentService = new StudentService();

    public void studentInformation() {
        while (true) {
            System.out.println(" Do you want to add students? - please choice number");
            System.out.println("1. Add new students");
            System.out.println("2. Show student list");
            System.out.println("3. Delete any Student");
            System.out.println("4. Find any Student");
            System.out.println("5. Exit ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1 :
                    studentService.addStudent();
                    break;
                case 2 :
                    studentService.displayAllStudent();
                    break;
                case 3 :
                    studentService.removeStudent();
                    break;
                case 4 :
                   studentService.findStudent();
                case 5 :
                    return;
                default:
                    System.out.println("Please enter again !");
            }

        }
    }

}
