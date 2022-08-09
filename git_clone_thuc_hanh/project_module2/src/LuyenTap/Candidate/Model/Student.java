package LuyenTap.Candidate.Model;

import java.util.Scanner;

public class Student {
    // code , name , birthday, point ( math ; literature ; english )
    private int code;
    private String name;
    private String birthday;
    private float math;
    private float literature;
    private float english;


    Student() {};

    Student(int code, String name, String birthday, int math, int literature, int english) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }


    // cho người dùng nhập thông tin
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("write your name");
        name = sc.nextLine();

        System.out.println("input your birthday");
        birthday = sc.nextLine();

        System.out.println("input your code");
        code = sc.nextInt();

        System.out.println("input match point");
        math = sc.nextInt();

        System.out.println("input literature point");
        literature = sc.nextInt();

        System.out.println("input english point");
        english = sc.nextInt();
    }


    // hiển thị thông tin
    public void Output() {
        System.out.println("thông tin thí sinh :");
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Birthday : " + birthday);
        System.out.println("điểm toán: " + math + "\n" + "điểm văn : " + literature + "\n" + "điểm anh: " + english);
    }

//     in ra thông tin các thí sinh có tổng điểm lớn hơn 15
    public void PointList() {
        float point = ((math + literature + english)/3);
        if (point > 15) {
            System.out.println("top " + name + point);
        }
    }
}

