package LuyenTap.CaseStudy.service.impl;

import LuyenTap.CaseStudy.model.Student;
import LuyenTap.CaseStudy.service.IStudentService;
import LuyenTap.CaseStudy.service.ScoreException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "quang", "1/12/95", "nam", 10, "c0622g1"));
        students.add(new Student(2, "duy", "12/12/01", "nam", 5, "c0622g1"));
        students.add(new Student(3, "tiến", "12/12/01", "nam", 5, "c0622g1"));
        students.add(new Student(4, "huy", "12/12/99", "nam", 5, "c0622g1"));
        students.add(new Student(4, "huy", "12/12/99", "nam", 5, "c0622g1"));
        students.add(new Student(5, "đức ", "12/12/03", "nam", 5, "c0622g1"));
        students.add(new Student(6, "hùng", "12/12/98", "nam", 5, "c0622g1"));
    }

    // thêm học sinh
    @Override
    public void addStudent() {
        Student student = this.StudentInfor();
        students.add(student);
        System.out.println("completed");
    }


    // phân đoạn nhập thông tin học sinh
    private Student StudentInfor() {
        System.out.print("Please input ID :  ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Please Written your name :  ");
        String name = sc.nextLine();
        System.out.print("Please input your birthday : ");
        String birthday = sc.nextLine();
        System.out.print("Please input your sex : ");
        String sex = sc.nextLine();
        System.out.print("Please input your name class :");
        String nameClass = sc.nextLine();
        double score;
        while (true) {
            try {
                System.out.println("please input your score : ");
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 100) {
                    throw new ScoreException("không thể nhập điểm nhỏ hơn 0 hoặc lớn hơn 100 ");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("yêu cầu nhập lại , hãy nhập số ");
            } catch (ScoreException s) {
                System.out.println(s.getMessage());
            } catch (Exception e) {
            }
        }

        Student student = new Student(id, name, birthday, sex, score, nameClass);
        System.out.println(student);
        return student;

    }

    //hiển thị danh sách học sinh
    @Override
    public void displayAllStudent() {

        // hiển thị danh sách
        sortStudent();
        for (Student student : students) {
            System.out.println(student);
        }



    }

    // xóa học sinh
    @Override
    public void removeStudent() {
        Student student = this.foundStudent();
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


    // tìm học sinh theo tên hoặc ID
    @Override
    public void findStudent() {
        System.out.println("--if you remember StudentID please choice 1-- ");
        System.out.println("--if not please choice 2-- ");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                Student student = this.findId();
                break;
            case 2:
                Student student1 = this.findName();
                break;
        }

    }


    // phân đoạn tìm học sinh theo ID để xóa
    private Student foundStudent() {
        System.out.println("Enter the ID you want to delete");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }


    // phân đoạn tìm học sinh theo ID
    private Student findId() {
        System.out.println("please input studentID");
        int findId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == findId) {
                System.out.println("Result : " + students.get(i));
            }
        }
        return null;
    }


    // phân đoạn tìm học sinh theo tên trong trường hợp không nhớ ID
    private Student findName() {
        System.out.println("please write student name");
        String findName = sc.nextLine();
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(findName)) {
                System.out.println("Result : " + students.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("sorry , we did not find ");
        }
        return null;
    }

    //        danh sách sắp xếp
//    private void sortStudent() {
//        while (true) {
//            boolean isSwap = true;
//            for (int i = 0; i < students.size() && isSwap; i++) {
//                isSwap = false;
//                for (int j = 0; j < students.size() - 1 - i; j++) {
//                    if (students.get(j).getName().charAt(0) > students.get(j + 1).getName().charAt(0)) ;
//                    isSwap = true;
//                    Student student1 = students.get(j + 1);
//                    students.set(j + 1, students.get(j));
//                    students.set(j, student1);
//
//                }
//            }
//        }
//    }
//}

// hiển thị danh sách sắp xếp tên theo thứ tự dùng compareTo
      private void sortStudent() {
            boolean isSwap = true;
            Student student1;
            for (int i = 0; i <students.size() && isSwap ; i++) {
                isSwap = false;
                for (int j = 0; j < students.size()-1-i ; j++) {
                    if (students.get(j).getName().compareTo(students.get(j+1).getName())>0);
                    isSwap = true;
                    student1 = students.get(j+1);
                    students.set(j+1,students.get(j));
                    students.set(j,student1);

                }
            }
        }
      }

