package practice;

import com.sun.deploy.net.offline.OfflineHandler;

public class variable_dataType {
    public static void main(String[] args) {
        int i = 10 ;                    // khai báo biến i có kiểu int là số nguyên bằng 10
        float f =20.5f;                 // khai báo biến f có kiểu float , nếu kh có f cuối cùng sẽ bị hiểu nhầm là double
        double d = 20.5;                // khai báo biến d có kiểu double , là một số nguyên
        boolean b = true ;              // khai báo biến b có kiểu boolean trả về true /false
        char c ='a' ;                   // khai báo biến c có kiểu char - chỉ sử dụng '' vì mỗi kí tự sẽ có 1 giá trị riêng
        String s = "Hà Nội";            // khai báo biến có giá trị là chuỗi
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
    }
}
