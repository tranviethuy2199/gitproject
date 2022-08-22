package LuyenTap.StudentManager.model;

public abstract class Person {
    private int id;
    private String name;
    private String birthday;
    private String sex;


    public Person() {};

    public Person(int id, String name, String birthday, String sex) {
       this.id = id;
       this.name = name;
       this.birthday = birthday;
       this.sex = sex;

   }

//   public void Input() {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("input id");
//       id = sc.nextInt();
//
//       System.out.println("write your name");
//       name = sc.nextLine();
//
//       System.out.println("input your birthday");
//       birthday = sc.nextLine();
//
//       System.out.println("giới tính");
//       sex = sc.nextLine();
//
//       System.out.println("cmnd");
//       cmnd = sc.nextInt();
//
//       System.out.println("input your level ");
//       level = sc.nextLine();
//
//       System.out.println("trình độ văn hóa ");
//       education = sc.nextLine();
//
//       System.out.println("lương cơ bản");
//       wage = sc.nextInt();
//   }
//
//   public void Output() {
//       System.out.println(id);
//       System.out.println(name);
//       System.out.println(birthday);
//       System.out.println(sex);
//       System.out.println(cmnd);
//       System.out.println(level);
//       System.out.println(education);
//       System.out.println(wage);
//   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String toString() {
        return "Person{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", birthday='" + this.birthday + '\'' +
                ", sex='" + this.sex + '\'' +
                '}';
    }



}
