package LuyenTap.StudentManager.service.impl;

import LuyenTap.StudentManager.model.Student;
import LuyenTap.StudentManager.service.IStudentService;
import LuyenTap.StudentManager.service.ScoreException;
import LuyenTap.StudentManager.service.textKey.NameFormat;
import com.sun.deploy.net.socket.UnixDomainSocket;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> students;

    static {
        try {
            students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final String PATH_NAME_FILE_STUDENT = "src\\LuyenTap\\StudentManager\\data\\student.txt";


    // thêm học sinh
    @Override
    public void addStudent() throws IOException {
        students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");

        Student student = this.StudentInfor();
        students.add(student);
        System.out.println("completed");

        // truyền file data ghi nhận và tham số studemts
        writeStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt",students);
    }


    // phân đoạn nhập thông tin học sinh
    private Student StudentInfor() {
        System.out.print("Please input ID :  ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Please Written your name :  ");
        String name;
        while (true) {
            name = sc.nextLine();
           if (name.toLowerCase().matches("[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ ]{5,50}")){
               break;
           }else {
               System.out.println("mời nhập lại");
           }
        }
        System.out.print("Please input your birthday : ");
        String birthday = sc.nextLine();
        System.out.print("Please input your sex : ");
        String sex = sc.nextLine();
        System.out.print("Please input your name class :");
        String nameClass;
        while (true) {
            nameClass = sc.nextLine();
            if (nameClass.matches("(A|C)[\\d]{4}(G|I)[1]")){
                break;
            }else {
                System.out.println("mời nhập lại");
            }
        }
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
    public void displayAllStudent() throws IOException {

        // hiển thị danh sách đã sắp xếp
        students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");
       sortStudent();
        for (Student student : students) {
            System.out.println(student);
        }


    }


    // xóa học sinh
    @Override
    public void removeStudent() throws IOException {
        Student student = this.foundStudent();
        if (student == null) {
            System.out.println("Sorry , We did not find !");
        } else {
            System.out.println("Do you really want to delete" + student.getId() + "right ?");
            System.out.println("1 . Yes !?");
            System.out.println("2 . No !?");
            int choose = Integer.parseInt(sc.nextLine());
            if (choose == 1) {
                students.remove(student);
                System.out.println("delete completed");
            }
        }
    }


    // tìm học sinh theo tên hoặc ID
    @Override
    public void findStudent() throws IOException {
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
    private Student foundStudent() throws IOException {
        students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");
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
    private Student findId() throws IOException {
        students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");
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
    private Student findName() throws IOException {
        students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");
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

    // hiển thị danh sách sắp xếp tên theo thứ tự dùng compareTo
    private void sortStudent() throws IOException {
        students = readStudentFile("src\\LuyenTap\\StudentManager\\data\\student.txt");
        boolean isSwap = true;
        Student newStudent;
        for (int i = 0; i < students.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    isSwap = true;
                    newStudent = students.get(j + 1);
                    students.set(j + 1, students.get(j));
                    students.set(j, newStudent);
                }
            }
        }
//        writeStudentFile(PATH_NAME_FILE_STUDENT,students);
    }


    // phương thức đọc file
    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;
    }

    // phương thức đọc file
    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], info[2],info[3],Double.parseDouble(info[4]),info[5]));
        }

        return students;
    }


    // phương thức viết file
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }


    // phương thức viết file
    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student : students) {
            data += student.toString();
            data += "\n";
        }

        writeFile(path, data);
    }


}

