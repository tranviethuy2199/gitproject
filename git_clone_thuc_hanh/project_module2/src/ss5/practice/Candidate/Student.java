package ss5.practice.Candidate;


import java.util.Scanner;

public class Student {

    // code , name , birthday, point ( math ; literature ; english )
    private int code;
    private String name;
    private String birthday;
    private float math;
    private float literature;
    private float english;
    private float point;

    Student() {
    }

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

    // in ra thông tin các thí sinh có tổng điểm lớn hơn 15
    public void PointList() {
        point = ((math + literature + english) / 3);
        if (point > 15) {
            System.out.println("top student : " + name + "\t" + code + "\t" + point);
        }
    }
}

class Information {
    private Student[] students;
    private int n;


    public Information() {
        students = new Student[100];
        n = 10;
    }
    public Information(int n ){
        if (n>=0){
            this.n=n;
        }else {
            this.n=0;
        }
        students = new Student[n];
    }

    public void Input1() {
        for (int i = 0; i < n; i++) {
            this.students[i] = new Student();
            this.students[i].Input();
        }
    }

    public void Output1() {
        for (int i = 0; i < n; i++) {
            this.students[i].Output();
        }
    }

    void pointList() {
        for (int i = 0; i < n; i++) {
            this.students[i].PointList();
        }
    }
}


