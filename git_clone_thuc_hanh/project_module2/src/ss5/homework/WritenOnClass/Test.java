package ss5.homework.WritenOnClass;

public class Test {
    public static void main(String[] args) {
        WrittenOnClass.change("C02");

        WrittenOnClass s1 = new WrittenOnClass("Huy");
        WrittenOnClass s2 = new WrittenOnClass();
        WrittenOnClass s3 = new WrittenOnClass("Hiếu");

        s1.display();

        s2.setName("Hải");
        s2.display();
        // gọi lại hàm sau khhi sửa chữa


        s3.display();



    }
}
