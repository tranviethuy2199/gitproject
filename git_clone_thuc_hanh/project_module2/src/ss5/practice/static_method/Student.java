package ss5.practice.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "AUDIT";
    // dùng khhi thay đổi khi các đối tượng mang cùng giá trị giống nhau
    // để dễ dàng thay đổi khi cần mà không cần truy cập đến các.



    public Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change(String chuoi){
        college = chuoi;
    }
    void display(){
        System.out.println( rollno + "" + name + "" + college);
    }

    public void getId() {
    }
}
