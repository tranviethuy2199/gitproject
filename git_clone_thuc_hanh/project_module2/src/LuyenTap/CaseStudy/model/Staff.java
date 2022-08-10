package LuyenTap.CaseStudy.model;

import LuyenTap.CaseStudy.controller.StaffInformation;

import java.util.Scanner;

public class Staff  {
    private int id;
    private String name;
    private String birthday;
    private String sex;
    private int cmnd;
    private String level;
    private String education;
    private int wage;


   Staff() {};

   Staff(int id, String name, String birthday, String sex, int cmnd, String level, String education,int wage) {
       this.id = id;
       this.name = name;
       this.birthday = birthday;
       this.sex = sex;
       this.cmnd = cmnd;
       this.level = level;
       this.education = education;
       this.wage = wage;

   }

   public void Input() {
       Scanner sc = new Scanner(System.in);
       System.out.println("input id");
       id = sc.nextInt();

       System.out.println("write your name");
       name = sc.nextLine();

       System.out.println("input your birthday");
       birthday = sc.nextLine();

       System.out.println("giới tính");
       sex = sc.nextLine();

       System.out.println("cmnd");
       cmnd = sc.nextInt();

       System.out.println("input your level ");
       level = sc.nextLine();

       System.out.println("trình độ văn hóa ");
       education = sc.nextLine();

       System.out.println("lương cơ bản");
       wage = sc.nextInt();
   }

   public void Output() {
       System.out.println(id);
       System.out.println(name);
       System.out.println(birthday);
       System.out.println(sex);
       System.out.println(cmnd);
       System.out.println(level);
       System.out.println(education);
       System.out.println(wage);
   }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", cmnd=" + cmnd +
                ", level='" + level + '\'' +
                ", education='" + education + '\'' +
                ", wage=" + wage +
                '}';
    }


}
