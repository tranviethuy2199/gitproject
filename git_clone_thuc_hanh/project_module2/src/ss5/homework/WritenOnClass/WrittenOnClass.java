package ss5.homework.WritenOnClass;

public class WrittenOnClass {
    private String name ;
    private static String classes = "AUDIT";


    WrittenOnClass() {
        name = "Jonh";
        classes = "CO2";
    }
    WrittenOnClass(String n) {
        name = n ;

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void change(String chuoi) {
       classes = chuoi;
    }

    void display () {
        System.out.println("Tên học sinh :" +name + "\t");
        System.out.println("Tên lớp :" + classes);
    }

}
